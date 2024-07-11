package hotel;

import java.util.Arrays;

import exceptions.HotelException;

public class CameraStandard implements PrenotazioneHotel {
    private int camereTotali;
    private int camereDisponibili;
    private String[] ospitiPrenotati;

    public CameraStandard(int camereTotali) {
        this.camereTotali = camereTotali;
        this.camereDisponibili = camereTotali;
        this.ospitiPrenotati = new String[camereTotali];
    }

    @Override
    public void prenotaCamera(String nomeOspite) throws HotelException {
        for (int i = 0; i < ospitiPrenotati.length; i++) {
            if (ospitiPrenotati[i] == null) {
                this.camereDisponibili--;
                ospitiPrenotati[i] = nomeOspite;
                System.out.println("Camera prenotata per " + nomeOspite);
                return;
            }
        }
        throw new HotelException("Nessuna camera disponibile per " + nomeOspite);
    }

    @Override
    public void cancellaCamera(String nomeOspite) throws HotelException {
        for (int i = 0; i < ospitiPrenotati.length; i++) {
            if (ospitiPrenotati[i] != null && ospitiPrenotati[i].equals(nomeOspite)) {
                this.camereDisponibili++;
                ospitiPrenotati[i] = null;
                System.out.println("Prenotazione cancellata per " + nomeOspite);
                return;
            }
        }
        throw new HotelException("Nessuna prenotazione trovata per " + nomeOspite);
    }

    @Override
    public String toString() {
        return "CameraStandard{" +
                "camereDisponibili=" + camereDisponibili +
                ", ospitiPrenotati=" + Arrays.toString(ospitiPrenotati) +
                '}';
    }
}

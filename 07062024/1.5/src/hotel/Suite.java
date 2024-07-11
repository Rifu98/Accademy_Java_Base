package hotel;

import java.util.ArrayList;
import java.util.List;

import exceptions.HotelException;

public class Suite implements PrenotazioneHotel {
    private int suiteTotali;
    private List<String> ospitiPrenotati;

    public Suite(int suiteTotali) {
        this.suiteTotali = suiteTotali;
        this.ospitiPrenotati = new ArrayList<>(suiteTotali);
    }

    @Override
    public void prenotaCamera(String nomeOspite) throws HotelException {
        if (ospitiPrenotati.size() < suiteTotali) {
            ospitiPrenotati.add(nomeOspite);
            System.out.println("Suite prenotata per " + nomeOspite);
        } else {
            throw new HotelException("Nessuna suite disponibile per " + nomeOspite);
        }
    }

    @Override
    public void cancellaCamera(String nomeOspite) throws HotelException {
        if (ospitiPrenotati.remove(nomeOspite)) {
            System.out.println("Prenotazione cancellata per " + nomeOspite);
        } else {
            throw new HotelException("Nessuna prenotazione trovata per " + nomeOspite);
        }
    }

    @Override
    public String toString() {
        return "Suite{" +
                "suiteDisponibili=" + (suiteTotali - ospitiPrenotati.size()) +
                ", ospitiPrenotati=" + ospitiPrenotati +
                '}';
    }
}

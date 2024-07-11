package hotel;

import java.util.ArrayList;
import java.util.List;

public class Suite implements PrenotazioneHotel {
    private int suiteTotali;
    private List<String> ospitiPrenotati;

    public Suite(int suiteTotali) {
        this.suiteTotali = suiteTotali;
        this.ospitiPrenotati = new ArrayList<>(suiteTotali);
    }

    @Override
    public void prenotaCamera(String nomeOspite) {
        if (ospitiPrenotati.size() < suiteTotali) {
            ospitiPrenotati.add(nomeOspite);
            System.out.println("Suite prenotata per " + nomeOspite);
        } else {
            System.out.println("Nessuna suite disponibile per " + nomeOspite);
        }
    }

    @Override
    public void cancellaCamera(String nomeOspite) {
        if (ospitiPrenotati.remove(nomeOspite)) {
            System.out.println("Prenotazione cancellata per " + nomeOspite);
        } else {
            System.out.println("Nessuna prenotazione trovata per " + nomeOspite);
        }
    }

    @Override
    public String toString() {
        return "Suite{" +
                "suiteDisponibili=" + (suiteTotali-ospitiPrenotati.size()) +
                ", ospitiPrenotati=" + ospitiPrenotati +
                '}';
    }
}

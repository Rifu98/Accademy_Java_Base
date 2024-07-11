package voli;

import java.util.ArrayList;
import java.util.List;

public class ClasseBusiness implements PrenotazioneVolo {
    private int postiDisponibili;
    private int prenotazioni;
    private List<String> passeggeriPrenotati;

    public ClasseBusiness(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
        this.prenotazioni = 0;
        this.passeggeriPrenotati = new ArrayList<>(postiDisponibili);
    }

    @Override
    public void prenotaBiglietto(String nomePasseggero) {
        if (passeggeriPrenotati.size() < postiDisponibili) {
        	prenotazioni++;
            passeggeriPrenotati.add(nomePasseggero);
            System.out.println("Biglietto prenotato per " + nomePasseggero + " in classe business");
        } else {
            System.out.println("Nessun posto disponibile per " + nomePasseggero + " in classe business");
        }
    }

    @Override
    public void cancellaBiglietto(String nomePasseggero) {
        if (passeggeriPrenotati.remove(nomePasseggero)) {
        	prenotazioni--;
            System.out.println("Prenotazione cancellata per " + nomePasseggero + " in classe business");
        } else {
            System.out.println("Nessuna prenotazione trovata per " + nomePasseggero + " in classe business");
        }
    }

    @Override
    public String toString() {
        return "ClasseBusiness{" +
                "postiDisponibili=" + (postiDisponibili - prenotazioni) +
                ", passeggeriPrenotati=" + passeggeriPrenotati +
                '}';
    }
}

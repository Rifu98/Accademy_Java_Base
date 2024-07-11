package voli;

import java.util.Arrays;

public class ClasseEconomy implements PrenotazioneVolo {
    private int postiDisponibili;
    private int prenotazioni;
    private String[] passeggeriPrenotati;

    public ClasseEconomy(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
        this.prenotazioni = 0;
        this.passeggeriPrenotati = new String[postiDisponibili];
    }

    @Override
    public void prenotaBiglietto(String nomePasseggero) {
        for (int i = 0; i < passeggeriPrenotati.length; i++) {
            if (passeggeriPrenotati[i] == null) {
            	prenotazioni++;
                passeggeriPrenotati[i] = nomePasseggero;
                System.out.println("Biglietto prenotato per " + nomePasseggero + " in classe economy");
                return;
            }
        }
        System.out.println("Nessun posto disponibile per " + nomePasseggero + " in classe economy");
    }

    @Override
    public void cancellaBiglietto(String nomePasseggero) {
        for (int i = 0; i < passeggeriPrenotati.length; i++) {
            if (passeggeriPrenotati[i] != null && passeggeriPrenotati[i].equals(nomePasseggero)) {
            	prenotazioni--;
                passeggeriPrenotati[i] = null;
                System.out.println("Prenotazione cancellata per " + nomePasseggero + " in classe economy");
                return;
            }
        }
        System.out.println("Nessuna prenotazione trovata per " + nomePasseggero + " in classe economy");
    }

    @Override
    public String toString() {
        return "ClasseEconomy{" +
                "postiDisponibili=" + (postiDisponibili - prenotazioni) +
                ", passeggeriPrenotati=" + Arrays.toString(passeggeriPrenotati) +
                '}';
    }
}

package seggio;

import java.util.List;

import cittadini.*;

public class Seggio {
    private List<Cittadino> cittadini;

    public Seggio(List<Cittadino> cittadini) {
        this.cittadini = cittadini;
    }

    public int[] getVotiCamera() {
    	
        int[] conteggi = new int[4]; // [SINISTRA, CENTRO, DESTRA, NULLO]
        
        for (Cittadino cittadino : cittadini) {
            conteggi[cittadino.getVotoCamera().ordinal()]++;
        }
        
        return conteggi;
    }

    public int[] getVotiSenato() {
    	
        int[] conteggi = new int[4]; // [SINISTRA, CENTRO, DESTRA, NULLO]
        
        for (Cittadino cittadino : cittadini) {
        	
            if (cittadino instanceof CittadinoSenato) {
            	CittadinoSenato cittadinoSenato = (CittadinoSenato) cittadino;
            	int index = cittadinoSenato.getVotoSenato().ordinal();
                conteggi[index]++;
            }
        }
        
        return conteggi;
    }
}

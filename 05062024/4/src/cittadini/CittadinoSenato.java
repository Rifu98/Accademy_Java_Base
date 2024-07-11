package cittadini;

import util.Voto;

public class CittadinoSenato extends Cittadino {
    private Voto votoSenato;

    public CittadinoSenato() {
        super();
        this.votoSenato = Voto.NULLO;
    }

    public Voto getVotoSenato() {
        return votoSenato;
    }

    public void setVotoSenato(Voto votoSenato) {
        this.votoSenato = votoSenato;
    }
}

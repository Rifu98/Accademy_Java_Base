package cittadini;

import util.Voto;

public class Cittadino {
    private Voto votoCamera;

    public Cittadino() {
        this.votoCamera = Voto.NULLO;
    }

    public Voto getVotoCamera() {
        return votoCamera;
    }

    public void setVotoCamera(Voto votoCamera) {
        this.votoCamera = votoCamera;
    }
}

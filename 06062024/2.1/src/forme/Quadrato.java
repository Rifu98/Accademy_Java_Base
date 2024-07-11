package forme;

public class Quadrato implements Forma {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato () {
    	return this.lato;
    }
    
    public void setLato (double lato) {
        this.lato = lato;
    }
    
    @Override
    public double calcolaPerimetro() {
        return 4 * lato;
    }

    @Override
    public double calcolaArea() {
        return lato * lato;
    }
    
}
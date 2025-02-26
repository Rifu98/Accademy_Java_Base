package forme;

public class Cerchio implements Forma {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    
    public double getRaggio () {
    	return this.raggio;
    }
    
    public void setRaggio (double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}
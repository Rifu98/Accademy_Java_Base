package forme;

public class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    public double getBase () {
    	return this.base;
    }
    
    public void setBase (double base) {
        this.base = base;
    }
    
    public double getAltezza () {
    	return this.altezza;
    }
    
    public void setAltezza (double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}

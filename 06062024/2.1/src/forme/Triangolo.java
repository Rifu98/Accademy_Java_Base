package forme;

public class Triangolo implements Forma {
    private double lato1, lato2, lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public double getLato1 () {
    	return this.lato1;
    }
    
    public void setLato1 (double lato1) {
        this.lato1 = lato1;
    }
    
    public double getLato2 () {
    	return this.lato2;
    }
    
    public void setLato2 (double lato2) {
        this.lato2 = lato2;
    }
    
    public double getLato3 () {
    	return this.lato3;
    }
    
    public void setLato3 (double lato3) {
        this.lato3 = lato3;
    }

    @Override
	public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
	public double calcolaArea() {
        // Implementa il calcolo dell'area per un triangolo (potresti usare la formula di Erone)
        return 0.0;
    }
}
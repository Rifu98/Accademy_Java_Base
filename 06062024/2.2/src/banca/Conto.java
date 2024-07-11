package banca;

public abstract class Conto {
    protected double capitaleIniziale;
    protected double tassoInteresse;
    protected int anni;

    public Conto(double capitaleIniziale, double tassoInteresse, int anni) {
        this.capitaleIniziale = capitaleIniziale;
        this.tassoInteresse = tassoInteresse;
        this.anni = anni;
    }
    
    public void setCapitaleIniziale(double capitaleIniziale) {
        this.capitaleIniziale = capitaleIniziale;
    }

    public double getTassoInteresse() {
        return tassoInteresse;
    }

    public void setTassoInteresse(double tassoInteresse) {
        this.tassoInteresse = tassoInteresse;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }
}

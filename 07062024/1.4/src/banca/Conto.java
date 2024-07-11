package banca;

import exceptions.InvalidValueException;

public abstract class Conto {
    protected double capitaleIniziale;
    protected double tassoInteresse;
    protected int anni;

    public Conto(double capitaleIniziale, double tassoInteresse, int anni) throws InvalidValueException {
        if (capitaleIniziale <= 0) {
            throw new InvalidValueException("Il capitale iniziale deve essere maggiore di zero.");
        }
        if (tassoInteresse <= 0) {
            throw new InvalidValueException("Il tasso di interesse deve essere maggiore di zero.");
        }
        if (anni <= 0) {
            throw new InvalidValueException("Il numero di anni deve essere maggiore di zero.");
        }
        this.capitaleIniziale = capitaleIniziale;
        this.tassoInteresse = tassoInteresse;
        this.anni = anni;
    }

    public void setCapitaleIniziale(double capitaleIniziale) throws InvalidValueException {
        if (capitaleIniziale <= 0) {
            throw new InvalidValueException("Il capitale iniziale deve essere maggiore di zero.");
        }
        this.capitaleIniziale = capitaleIniziale;
    }

    public double getTassoInteresse() {
        return tassoInteresse;
    }

    public void setTassoInteresse(double tassoInteresse) throws InvalidValueException {
        if (tassoInteresse <= 0) {
            throw new InvalidValueException("Il tasso di interesse deve essere maggiore di zero.");
        }
        this.tassoInteresse = tassoInteresse;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) throws InvalidValueException {
        if (anni <= 0) {
            throw new InvalidValueException("Il numero di anni deve essere maggiore di zero.");
        }
        this.anni = anni;
    }
}

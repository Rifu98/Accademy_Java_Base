package banca;

import exceptions.InvalidValueException;

public class ContoCorrenteInteressiSemplici extends Conto implements Interessi {

    public ContoCorrenteInteressiSemplici(double capitaleIniziale, double tassoInteresse, int anni) throws InvalidValueException {
        super(capitaleIniziale, tassoInteresse, anni);
    }

    @Override
    public double sommaCorrente() {
        return capitaleIniziale * (1 + anni * tassoInteresse / 100);
    }
}


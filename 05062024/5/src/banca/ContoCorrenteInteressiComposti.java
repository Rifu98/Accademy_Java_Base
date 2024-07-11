package banca;

public class ContoCorrenteInteressiComposti extends ContoCorrente {

    public ContoCorrenteInteressiComposti(double capitaleIniziale, double tassoInteresse, int anni) {
        super(capitaleIniziale, tassoInteresse, anni);
    }

    @Override
    public double sommaCorrente() {
        return capitaleIniziale * Math.pow((1 + tassoInteresse / 100), anni);
    }
}

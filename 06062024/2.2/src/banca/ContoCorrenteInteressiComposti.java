package banca;

public class ContoCorrenteInteressiComposti extends Conto implements Interessi {

    public ContoCorrenteInteressiComposti(double capitaleIniziale, double tassoInteresse, int anni) {
        super(capitaleIniziale, tassoInteresse, anni);
    }

    @Override // ci va l'override?
    public double sommaCorrente() {
        return capitaleIniziale * Math.pow((1 + tassoInteresse / 100), anni);
    }
}

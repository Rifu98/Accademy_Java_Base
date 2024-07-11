package mezziDiTrasporto;

public class Airplane extends Transport {

    @Override
    public void start() {
        System.out.println("L'eareo decolla");
    }

    @Override
    public void stop() {
        System.out.println("L'aereo atterra");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 1.5;
    }
}
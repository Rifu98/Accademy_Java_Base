package mezziDiTrasporto;

public class Bus extends Transport {

    @Override
    public void start() {
        System.out.println("Il Bus parte");
    }

    @Override
    public void stop() {
        System.out.println("Il bus arriva");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 0.5;
    }
}

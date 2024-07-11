package mezziDiTrasporto;

public class Train extends Transport {

    @Override
    public void start() {
        System.out.println("Il treno parte");
    }

    @Override
    public void stop() {
        System.out.println("Il treno arriva in stazione");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 0.3;
    }
}

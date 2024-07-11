package mezziDiTrasporto;

import exceptions.InvalidDistanceException;

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
    public double calculateCost(double distance) throws InvalidDistanceException {
        if (distance <= 0) {
            throw new InvalidDistanceException("La distanza deve essere maggiore di zero");
        }
        return distance * 0.3;
    }
}

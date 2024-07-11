package mezziDiTrasporto;

import exceptions.InvalidDistanceException;

public class Airplane extends Transport {

    @Override
    public void start() {
        System.out.println("L'aereo decolla");
    }

    @Override
    public void stop() {
        System.out.println("L'aereo atterra");
    }

    @Override
    public double calculateCost(double distance) throws InvalidDistanceException {
        if (distance <= 0) {
            throw new InvalidDistanceException("La distanza deve essere maggiore di zero");
        }
        return distance * 1.5;
    }
}

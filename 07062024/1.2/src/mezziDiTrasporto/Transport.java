package mezziDiTrasporto;

import exceptions.InvalidDistanceException;
import exceptions.InvalidSpeedException;

public abstract class Transport {
    protected double speed;

    public abstract void start();
    public abstract void stop();
    public abstract double calculateCost(double distance) throws InvalidDistanceException, InvalidDistanceException;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) throws InvalidSpeedException {
        if (speed <= 0) {
            throw new InvalidSpeedException("La velocità deve essere maggiore di zero");
        }
        this.speed = speed;
    }
}

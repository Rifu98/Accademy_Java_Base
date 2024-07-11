package mezziDiTrasporto;

public abstract class Transport {
    protected double speed;

    public abstract void start();
    public abstract void stop();
    public abstract double calculateCost(double distance);

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

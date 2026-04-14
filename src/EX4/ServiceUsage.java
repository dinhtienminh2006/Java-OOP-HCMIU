package EX4;

public class ServiceUsage implements Chargeable {
    private double hours;
    private double rate;
    public ServiceUsage(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double getCharge() {
        return hours * rate;
    }
}

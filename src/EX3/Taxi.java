package EX3;

public class Taxi extends Transport {
    private int distance;

    public Taxi(int baseFare, int distance) {
        super(baseFare);
        this.distance = distance;
    }

    @Override
    public int calculateFare() {
        int fare = getBaseFare() + distance * 5;
        return fare;
    }
}

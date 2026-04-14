package EX3;

public class Bus extends Transport {
    private int distance;

    public Bus(int baseFare, int distance) {
        super(baseFare);
        this.distance = distance;
    }

    @Override
    public int calculateFare() {
        int fare = getBaseFare() + distance*2;
        return fare;
    }
}

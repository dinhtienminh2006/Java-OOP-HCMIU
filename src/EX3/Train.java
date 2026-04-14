package EX3;

public class Train extends Transport {
    private int distance;
    public Train(int baseFare, int distance) {
        super(baseFare);
        this.distance = distance;
    }

    @Override
    public int calculateFare() {
        int fare = getBaseFare() + distance*3;
        return fare;
    }

}

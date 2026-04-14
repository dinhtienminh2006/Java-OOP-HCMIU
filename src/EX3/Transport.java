package EX3;

public abstract class Transport {
    private int baseFare;

    public Transport(int baseFare) {
        this.baseFare = baseFare;
    }

    public abstract int calculateFare();

    public int getBaseFare() {
        return baseFare;
    }
}

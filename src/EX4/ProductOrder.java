package EX4;

public class ProductOrder implements Chargeable {
    private int quantity;
    private double price;

    public ProductOrder(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double getCharge() {
        return price * quantity;
    }
}

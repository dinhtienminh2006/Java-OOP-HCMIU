package EX4;

public class mainTest2 {
    public static void main(String[] args) {
        Chargeable[] items = new Chargeable[2];
        ProductOrder abc = new ProductOrder(5, 30.0);
        ServiceUsage xyz = new ServiceUsage(2, 40.0);

        items[0] = abc;
        items[1] = xyz;

        double total_charge = 0;
        for (int i = 0; i < items.length; i++) {
            total_charge += items[i].getCharge();
        }

        System.out.println("Total charge : " + total_charge);
    }
}

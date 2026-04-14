package EX3;

public class mainTest {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        Bus car1 = new Bus(10, 5);
        Taxi ca2 =  new Taxi(100, 10);
        Train car3 = new Train(500, 5);
        transports[0] = car1;
        transports[1] = ca2;
        transports[2] = car3;
        for (int i = 0; i < transports.length; i++) {
            System.out.println("Transport fee of" + transports[i] + "is:" + transports[i].calculateFare());
        }
    }
}

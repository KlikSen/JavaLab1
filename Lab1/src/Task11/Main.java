package Task11;

public class Main {
    public static void main(final String[] args) {
        final Order order1 = new Order();

        final Driver[] drivers = new Driver[2];
        drivers[0] = new Driver("Maks", "+380970000321");
        drivers[1] = new Driver("Dima", "+380671100483");
        final Taxi taxi2 = new Taxi("Toyota", "AA8395MH", drivers, "888");
        final Order order2 = new Order(taxi2, 102, 73, 23);

        System.out.println(order1 + "\n");
        System.out.println(order2);
        System.out.println("order1.equals(order2): " + order1.equals(order2));

    }
}

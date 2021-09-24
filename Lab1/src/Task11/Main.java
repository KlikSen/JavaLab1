package Task11;

public class Main {
    public static void main(final String[] args) {

        final Driver[] drivers = new Driver[2];
        drivers[0] = new Driver("Maks", "+380970000321");
        drivers[1] = new Driver("Dima", "+380671100483");
        final Taxi taxi = new Taxi("Toyota", "AA8395MH", drivers, "888");
        final Order order = new Order(taxi, 102, 73, 23);

        System.out.println(order);
    }
}

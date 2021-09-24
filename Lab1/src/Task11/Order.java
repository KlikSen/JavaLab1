package Task11;

public class Order {
    private Taxi taxi;
    private int id;
    private int price;
    private int minutes;

    public Order() {}

    public Order(final Taxi taxi,final int id, final int price, final int minutes) {
        this.taxi = taxi;
        this.id = id;
        this.price = price;
        this.minutes = minutes;
    }

    public Taxi getTaxi() { return taxi; }

    public void setTaxi(final Taxi taxi) { this.taxi = taxi; }

    public int getId() { return id; }

    public void setId(final int id) { this.id = id; }

    public int getPrice() { return price; }

    public void setPrice(final int price) { this.price = price; }

    public int getMinutes() { return minutes; }

    public void setMinutes(final int minutes) { this.minutes = minutes; }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Order order = (Order) o;

        return this.taxi.equals(order.taxi) && (this.id == order.id) &&
                (this.price == order.price) && (this.minutes == order.minutes);
    }

    @Override
    public int hashCode() {
        return 13 * taxi.hashCode() +
                13 + id +
                13 * price +
                13 * minutes;
    }

    @Override
    public String toString() {
        return "Order" + id + ":" +
                "\ntaxi=" + taxi +
                "\nprice=" + price +
                " uah\nminutes=" + minutes;
    }
}

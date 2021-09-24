package Task11;

public class Car {
    private String brand;
    private String licensePlate;

    public Car() {}

    public Car(final String brand, final String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    public String getBrand() { return brand; }

    public void setBrand(final String brand) { this.brand = brand; }

    public String getLicensePlate() { return licensePlate; }

    public void setLicensePlate(final String licensePlate) { this.licensePlate = licensePlate; }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Car car = (Car) o;

        return this.licensePlate.equals(car.licensePlate) && this.brand.equals(car.brand);
    }



    @Override
    public int hashCode() {
        return 13 * brand.hashCode() +
                13 * licensePlate.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

package Task11;

import java.util.Arrays;

public class Taxi extends Car {
    private Driver[] drivers;
    private String taxiPhoneNumber;

    public Taxi() {}

    public Taxi(final String brand, final String licensePlate, final Driver[] drivers, final String taxiNumber) {
        super(brand, licensePlate);
        this.drivers = drivers;
        this.taxiPhoneNumber = taxiNumber;
    }

    public Driver[] getDrivers() { return this.drivers; }

    public void setDrivers(final Driver[] drivers) { this.drivers = drivers; }

    public String getTaxiPhoneNumber() { return this.taxiPhoneNumber; }

    public void setTaxiPhoneNumber(final String taxiPhoneNumber) { this.taxiPhoneNumber = taxiPhoneNumber; }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Taxi taxi = (Taxi) o;

        return this.drivers.equals(taxi.drivers) &&
                this.taxiPhoneNumber.equals(taxi.taxiPhoneNumber) &&
                this.getLicensePlate().equals(taxi.getLicensePlate()) &&
                this.getBrand().equals(taxi.getBrand());
    }

    @Override
    public int hashCode() {
        return 13 * drivers.hashCode() +
                13 * taxiPhoneNumber.hashCode() +
                13 * getBrand().hashCode() +
                13 * getLicensePlate().hashCode();
    }

    @Override
    public String toString() {
        final String space = "       ";

        return "Taxi: " +
                '\n' + space + "drivers=" + Arrays.toString(drivers) +
                '\n' + space + "orderNumber='" + taxiPhoneNumber + '\'' +
                '\n' + space + "brand='" + this.getBrand() + '\'' +
                '\n' + space + "license plate='" + this.getLicensePlate() + '\''
                ;
    }
}

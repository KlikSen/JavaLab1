package Task11;

public class Driver {
    private String name;
    private String phoneNumber;

    public Driver() {}

    public Driver(final String name, final String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }

    public void setName(final String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(final String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;

        return this.phoneNumber.equals(driver.phoneNumber) && this.name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return 13 * name.hashCode() +
                13 * phoneNumber.hashCode();
    }

    @Override
    public String toString() {
        final String space1 = "                 ";
        final String space2 = "               ";

        return "Driver: " +
                '\n' + space1 + "name='" + name + '\'' +
                '\n' + space1 + "phoneNumber='" + phoneNumber + "'\n" +
                space2;
    }
}

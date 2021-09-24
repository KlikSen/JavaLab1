package Task7;

public class User {
        private String firstName;
        private String lastName;
        private int age;
        private String email;


    public User() {}

    public User(final String firstName, final String lastName, final int age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

        public String getFirstName() { return firstName; }

        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(final int age) {
            this.age = age;
        }

        public String getEmail() { return email; }

        public void setEmail(final String email) { this.email = email; }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User student = (User) o;

        return this.email.equals(student.email);
    }

    @Override
    public int hashCode() {
        return 13 * email.hashCode() +
                13 * firstName.hashCode() +
                13 * lastName.hashCode() +
                13 * age;
    }

    @Override
    public String toString() {return firstName + ' ' + lastName + ' ' + age + ' ' + email; }
}

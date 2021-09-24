package Task7;

public class Main {
    public static void main(final String[] args) {
        final User user1 = new User("Eva", "Miller", 22, "eva.miller@gmail.com");
        final User user2 = new User("Eva", "Miller", 22, "eva.miller@gmail.com");
        final User user3 = new User("Daniel", "Miller", 25, "daniel.miller@gmail.com");

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
        System.out.println("user3: " + user3);
        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.equals(user3): " + user1.equals(user3));
        System.out.println("hashCode of user1: " + user1.hashCode());
        System.out.println("hashCode of user2: " + user2.hashCode());
        System.out.println("hashCode of user3: " + user3.hashCode());
    }
    }

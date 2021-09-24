package Task8;

public class Main {
    public static void main(final String[] args) {

        final CustomDouble numeric1 = new CustomDouble(1.6);
        final CustomDouble numeric2 = new CustomDouble(-1.8);
        final CustomDouble numericSum = numeric1.plus(numeric2);
        final CustomDouble numericDifference = numeric1.minus(numeric2);

        System.out.println("numeric1 = " + numeric1.toDouble());
        System.out.println("numeric2 = " + numeric2.toDouble());
        System.out.println("numeric1 + numeric2 = " + numericSum.toDouble());
        System.out.println("numeric1 - numeric2 = " + numericDifference.toDouble());
        System.out.println("numeric1 > numeric2 = " + numeric1.isBigger(numeric2));
        System.out.println("numeric1.equals(numeric2): " + numeric1.equals(numeric2));
    }
    }

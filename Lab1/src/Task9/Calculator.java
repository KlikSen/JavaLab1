package Task9;

import Task8.CustomDouble;

import java.util.Scanner;

public class Calculator {

    public void startCalculate() {
        final Scanner readChoose = new Scanner(System.in);
        int choose = 0;

        do {

            System.out.println("Input numeric1: ");
            final double numeric1 = readChoose.nextDouble();
            System.out.println("Input numeric2: ");
            final double numeric2 = readChoose.nextDouble();

            final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;

            System.out.println("Operations: \n" +
                    " [0] Exit \n [1] Add \n [2] Minus \n" +
                    " [3] Multiply \n [4] Divide \n" +
                    " [5] Equals \n [6] Not equals \n [7] More \n" +
                    " [8] More equals \n [9] Less \n [10] Less equals \n" +
                    " Choose operation: ");

            choose = readChoose.nextInt();

            switch (choose) {
                case 1:
                    plus(numeric1, numeric2);
                    break;
                case 2:
                    minus(numeric1, numeric2);
                    break;
                case 3:
                    multiply(numeric1, numeric2);
                    break;
                case 4:
                    divide(numeric1, numeric2);
                    break;
                case 5:
                    comparisonEquals(numeric1, numeric2);
                    break;
                case 6:
                    comparisonNotEquals(numeric1, numeric2);
                    break;
                case 7:
                    comparisonMore(numeric1, numeric2);
                    break;
                case 8:
                    comparisonMoreEquals(numeric1, numeric2);
                    break;
                case 9:
                    comparisonLess(numeric1, numeric2);
                    break;
                case 10:
                    comparisonLessEquals(numeric1, numeric2);
                    break;
                default:
                    break;
            }
        }while (choose != 0) ;

    }
    public void plus (final double numeric1,final  double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println((int) (numeric1 + numeric2));
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.plus(doubleNumeric2).toDouble());
        }
    }

    public void minus (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println((int) (numeric1 - numeric2));
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.minus(doubleNumeric2).toDouble());
        }
    }

    public void multiply (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println((int) (numeric1 * numeric2));
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.multiply(doubleNumeric2).toDouble());
        }
    }

    public void divide (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println((int) (numeric1 / numeric2));
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.divide(doubleNumeric2).toDouble());
        }
    }

    public void comparisonEquals (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 == numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.equals(doubleNumeric2));
        }
    }

    public void comparisonNotEquals (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 != numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(!(doubleNumeric1.equals(doubleNumeric2)));
        }
    }

    public void comparisonMore (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 > numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.isBigger(doubleNumeric2));
        }
    }

    public void comparisonMoreEquals (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 >= numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.isBiggerEquals(doubleNumeric2));
        }
    }

    public void comparisonLess (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 < numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.isLess(doubleNumeric2));
        }
    }

    public void comparisonLessEquals (final double numeric1, final double numeric2) {
        final boolean notDouble = (numeric1 - (int) numeric1) + (numeric2 - (int) numeric2) == 0;
        if (notDouble) {
            System.out.println(numeric1 <= numeric2);
        } else {
            final CustomDouble doubleNumeric1 = new CustomDouble(numeric1);
            final CustomDouble doubleNumeric2 = new CustomDouble(numeric2);

            System.out.println(doubleNumeric1.isLess(doubleNumeric2));
        }
    }
}

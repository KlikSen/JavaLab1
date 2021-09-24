package Task3;

public class Main {
    public static void main(final String[] args) {

        final int[] arrayOfInts = {1, 2, 3, 4, 7,3,2,2};
        final char[] arrayOfChars = {'d', 'g', 'y', 'h'};
        final String stringOfTwoArrays = combineTwoArrays(arrayOfInts, arrayOfChars);

            System.out.println(stringOfTwoArrays);
        }
        static String combineTwoArrays(final int[] arrayOfInts, final  char[] arrayOfChars){
            final StringBuilder stringOfTwoArrays = new StringBuilder();

            for (int i = 0; i < arrayOfInts.length; i++) {
                if (i < arrayOfInts.length) {
                    stringOfTwoArrays.append(arrayOfInts[i]);
                }
                if (i < arrayOfChars.length) {
                    stringOfTwoArrays.append(arrayOfChars[i]);
                }
            }
            return stringOfTwoArrays.toString();
        }
    }

package Task5;

public class Main {
    public static void main(final String[] args) {
        final int[][] array1 = {
                {31, 21, 45, 32},
                {1, 3, 5, 6},
                {98, 21, 1, 5}
        };
        final int[][] array2 = transMatrix(array1);

        printMatrix(array1);
        System.out.println();
        printMatrix(array2);
    }

    static int[][] transMatrix(final int[][] array) {
        final int rows = array.length;
        final int cols = array[0].length;

        final int[][] transArray = new int[cols][];
        for (int i = 0; i < cols; i++) {
            transArray[i] = new int[rows];
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transArray[i][j] = array[j][i];
            }
        }
        return transArray;
    }

    static void printMatrix(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

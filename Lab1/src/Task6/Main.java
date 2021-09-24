package Task6;

public class Main {
    public static void main(final String[] args) {
        final int[][] array1 = {
                {8, 1, 5, 2},
                {1, 3, 5, 6},
                {9, 2, 1, 5}
        };
        final int[][] array2 = {
                {1, 0, 1},
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        final int[][] array3 = multiplyMatrix(array1, array2);

        printMatrix(array1);
        System.out.println();
        printMatrix(array2);
        System.out.println();
        printMatrix(array3);
    }

    static int[][] multiplyMatrix(final int[][] arrayA, final int[][] arrayB) {
        final int rowsA = arrayA.length;
        final int colsA = arrayA[0].length;
        final int rowsB = arrayB.length;
        final int colsB = arrayB[0].length;

        final int[][] arrayC = new int[rowsA][];

        if (colsA != rowsB) {
            System.out.println("Error: these matrices cannot be multiplied");
        } else {
            for (int i = 0; i < rowsA; i++)
                arrayC[i] = new int[colsB];

            for (int i = 0; i < colsB; i++) {
                for (int j = 0; j < rowsA; j++) {
                    int t = 0;
                    for (int k = 0; k < rowsB; k++) t += arrayA[i][k] * arrayB[k][j];
                    arrayC[i][j] = t;
                }
            }
        }
        return arrayC;
    }

    static void printMatrix(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}

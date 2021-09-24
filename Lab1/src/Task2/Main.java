package Task2;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        final String[] s1 = {"apple", "banana", "orange"};

        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + ' ');
        }

        System.out.print("\n Imput the element you want to count: ");

        final Scanner readElement = new Scanner(System.in);
        final char element = readElement.next().charAt(0);

        final int count = countOfElem(s1, element);

        System.out.println("The number of element '" + element + "' = " + count);
    }

    static int countOfElem(final String[] arrayForFindElement,final  char element) {
        int countOfElement = 0;

        for (int i = 0; i < arrayForFindElement.length; i++) {
            for (int j = 0; j < arrayForFindElement[i].length(); j++) {
                if (arrayForFindElement[i].charAt(j) == element)
                    countOfElement++;
            }
        }
        return countOfElement;
    }
}


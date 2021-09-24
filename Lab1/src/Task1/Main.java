package Task1;

public class Main {
    public static void main(final String[] args) {

        final String[] notSortedArray = {"5sdgr", "4rhe", "7dgbkrf", "6sdftk"};
        final String[] sortedArray = sort(notSortedArray);

        for (final String i : sortedArray){
            System.out.println(i);
        }
    }
    static String[] sort(final String[] startArray){

        final String[] sortArray = startArray;

        for (int i = 1; i < sortArray.length; i++){
            for (int j = 0; j < sortArray.length - i; j++){
                if(sortArray[j].length() > sortArray[j + 1].length()){
                    final String copyOfElement = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = copyOfElement;
                }
            }
        }
        return sortArray;
    }
}

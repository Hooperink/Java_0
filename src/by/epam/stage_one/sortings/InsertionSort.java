package by.epam.stage_one.sortings;

public class InsertionSort {

    public static int[] insertionSort(int ... array){
        
        int current;
        int itemToCheck;

        for (int i = 1; i < array.length; i++) {
            current = array[i];
            itemToCheck = i - 1;
            while ((itemToCheck >= 0) && (current < array[itemToCheck])){
                array[itemToCheck + 1] = array[itemToCheck];
                itemToCheck--;
            }
            array[itemToCheck + 1] = current;
        }
        return array;
    }
}

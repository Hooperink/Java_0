package by.epam.task_one.stage_one.sortings;

public class SelectionSort {

    public static int[] selectionSort(int ... array){

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int position = i;
            for (int j = i + 1; j <array.length; j++) {
                if (array[j] < min){
                    min = array[j];
                    position = j;
                }
            }
            int buff = array[i];
            array[i] = array[position];
            array[position] = buff;
        }

        return array;
    }
}

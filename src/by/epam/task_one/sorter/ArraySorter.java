package by.epam.task_one.sorter;

public class ArraySorter {
    public static int[] insertionSort(int ... array){

        if (array == null){
            return null;
        }

        if (array.length < 2){
            return array;
        }

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


    public static int[] selectionSort(int ... array){

        if (array == null){
            return null;
        }

        if (array.length < 2){
            return array;
        }

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


    public static int[] sortMerge(int ... array){
        if (array == null){
            return null;
        }

        if (array.length < 2){
            return array;
        }

        int leftArray[] = new int [array.length/2];
        int rightArray[] = new int [array.length - array.length/2];

        System.arraycopy(array, 0, leftArray, 0, array.length/2);
        System.arraycopy(array, array.length/2, rightArray, 0, array.length - array.length/2);

        leftArray = sortMerge(leftArray);
        rightArray = sortMerge(rightArray);

        return merge(leftArray, rightArray);
    }


    private static int[] merge(int left[], int right[]){

        int mergedArray[] = new int [left.length + right.length];
        int leftPosition = 0;
        int rightPosition = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (leftPosition == left.length){
                mergedArray[i] = right[rightPosition];
                rightPosition++;
            } else if (rightPosition == right.length){
                mergedArray[i] = left[leftPosition];
                leftPosition++;
            } else if (left[leftPosition] < right[rightPosition]) {
                mergedArray[i] = left[leftPosition];
                leftPosition++;
            } else {
                mergedArray[i] = right[rightPosition];
                rightPosition++;
            }
        }
        return mergedArray;
    }
}

package by.epam.task_one.stage_one.sortings;

public class MergeSort {

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

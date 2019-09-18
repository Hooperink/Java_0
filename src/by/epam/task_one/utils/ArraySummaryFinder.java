package by.epam.task_one.utils;

public class ArraySummaryFinder {

    //TODO: Exception made yourself

    public  int findMax(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    //TODO: Exception made yourself

    public int findAverage(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int average = 0;

        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average/arr.length;
        return average;
    }

    //TODO: Exception made yourself

    public int findMin(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}

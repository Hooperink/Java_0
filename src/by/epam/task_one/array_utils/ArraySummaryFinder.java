package by.epam.task_one.array_utils;

import by.epam.task_one.exception.ArrayIsNullException;

public class ArraySummaryFinder {

    public  int findMax(int ... arr) throws ArrayIsNullException{

        if (arr == null){
            throw new ArrayIsNullException("Array is null");
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


    public int findAverage(int ... arr) throws ArrayIsNullException {

        if (arr == null){
            throw new ArrayIsNullException("Array is null");
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


    public int findMin(int ... arr) throws ArrayIsNullException{

        if (arr == null){
            throw new ArrayIsNullException("Array is null");
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

package by.epam.task_one.array_utils;

import by.epam.task_one.exception.ArrayIsNullException;

import java.util.Arrays;

public class ArrayStreamSummaryFinder {

    public int findMax(int ... array) throws ArrayIsNullException {
        if (array == null) {
            throw new ArrayIsNullException("Array is null");
        }
        return Arrays.stream(array).max().getAsInt();
    }

    public int findMin(int ... array) throws ArrayIsNullException{
        if (array == null) {
            throw new ArrayIsNullException("Array is null");
        }
        return Arrays.stream(array).min().getAsInt();
    }

    public int findAverage(int ... array) throws ArrayIsNullException{
        if (array == null ){
            throw new ArrayIsNullException("Array is null");
        }
        return (int) Arrays.stream(array).average().getAsDouble();
    }


}

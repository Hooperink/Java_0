package by.epam.task_one.array_utils;

import by.epam.task_one.exception.ArrayIsNullException;

import java.util.ArrayList;

public class ConverterFromArrayListToArray {

    public static double[] getArray(ArrayList <Double> arrayList) throws ArrayIsNullException {
        if (arrayList == null) {
            throw new ArrayIsNullException("Array is empty");
        }
        double [] array  = new double [arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}

package by.epam.task_one.utils;

import java.util.ArrayList;

public class ConverterFromArrayListToArray {

    public static double[] getArray(ArrayList <Double> arrayList){
        double [] array  = new double [arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}

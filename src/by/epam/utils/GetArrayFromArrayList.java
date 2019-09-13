package by.epam.utils;

import java.util.ArrayList;

public class GetArrayFromArrayList {

    public static int[] getArray(ArrayList <Integer> arrayList){
        int [] array  = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}

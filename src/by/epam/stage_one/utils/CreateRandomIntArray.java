package by.epam.stage_one.utils;

import java.util.Random;

public class CreateRandomIntArray {

    public static int[] createArray(int size){

        Random random = new Random();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}

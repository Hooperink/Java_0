package by.epam.task_one.creator;

import java.util.Random;

public class RandomArrayCreator {

    public final static int RANGE = 10;

    public int[] createArray(int size) {

        Random random = new Random();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(RANGE);
        }
        return array;
    }
}

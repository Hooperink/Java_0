package by.epam.task_one;

import by.epam.task_one.parser.IntArrayGetterFromFile;

public class Main {
    public static void main(String[] args) throws Exception {

        IntArrayGetterFromFile intArrayGetterFromFile = new IntArrayGetterFromFile();

        double []array  = intArrayGetterFromFile.getIntFromFile("./resource/numbers.txt");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

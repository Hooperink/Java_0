package by.epam.task_one;

import by.epam.task_one.parser.IntArrayGetterFromFile;

public class Main {
    public static void main(String[] args) throws Exception {

        IntArrayGetterFromFile intArrayGetterFromFile = new IntArrayGetterFromFile();

        double []array  = intArrayGetterFromFile.getIntFromFile("C:\\Users\\Вадим\\IdeaProjects\\java_0_epam\\resource\\numbers.txt");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

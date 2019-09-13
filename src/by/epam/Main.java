package by.epam;

import by.epam.stage_two.file_handler.IntArrayGet;


public class Main {
    public static void main(String[] args) {

        IntArrayGet intArrayGet = new IntArrayGet();
        int []array  = intArrayGet.getIntFromFile("C:\\Users\\Вадим\\IdeaProjects\\java_0_epam\\src\\by\\epam\\stage_two\\numbers.txt");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}

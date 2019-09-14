package by.epam.task_one;

import by.epam.task_one.stage_three.IntSummaryStatisticsArrayHandler;
import by.epam.task_one.stage_two.file_handler.IntArrayGet;


public class Main {
    public static void main(String[] args) {

        IntArrayGet intArrayGet = new IntArrayGet();
        int []array  = intArrayGet.getIntFromFile("C:\\Users\\Вадим\\IdeaProjects\\java_0_epam\\src\\by\\epam\\task_one\\stage_two\\numbers.txt");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        IntSummaryStatisticsArrayHandler handler = new IntSummaryStatisticsArrayHandler();
        System.out.println(handler.findMax(array));
        System.out.println(handler.findMin(array));
        System.out.println(handler.findAverage(array));


    }
}

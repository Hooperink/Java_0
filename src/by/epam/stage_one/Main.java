package by.epam.stage_one;

import by.epam.stage_one.sortings.SelectionSort;
import by.epam.stage_one.utils.CreateRandomIntArray;

public class Main {
    public static void main(String[] args) {
        int arr [] = CreateRandomIntArray.createArray(10);
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        arr = SelectionSort.selectionSort(arr);
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

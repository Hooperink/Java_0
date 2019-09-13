package by.epam.stage_one;

import by.epam.stage_one.sortings.SelectionSort;
import by.epam.stage_one.utils.CreateRandomIntArray;
import by.epam.stage_one.utils.FindMean;

public class Main {
    public static void main(String[] args) {
        CreateRandomIntArray createRandomIntArray = new CreateRandomIntArray();
        int arr [] = createRandomIntArray.createArray(10);
        for (int i: arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        try {
            System.out.println(FindMean.findMean(arr));
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}

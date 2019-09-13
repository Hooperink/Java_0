package by.epam.utils;

public class FindMinInArray {
    public static int findMin(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}

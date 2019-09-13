package by.epam.utils;

public class FindMaxInArray {

    public static int findMax(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}

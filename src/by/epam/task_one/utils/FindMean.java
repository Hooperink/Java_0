package by.epam.task_one.utils;

public class FindMean {

    public static int findMean(int ... arr) throws Exception{

        if (arr == null){
            throw new Exception("Array is null");
        }
        if (arr.length < 2) {
            return arr[0];
        }

        int mean = 0;

        for (int i = 0; i < arr.length; i++) {
            mean += arr[i];
        }
        mean = mean/arr.length;
        return mean;
    }
}

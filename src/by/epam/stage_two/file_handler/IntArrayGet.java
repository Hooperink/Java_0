package by.epam.stage_two.file_handler;

import by.epam.stage_two.validation.IntValidationResult;
import by.epam.stage_two.validation.Validation;
import by.epam.utils.GetArrayFromArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class IntArrayGet {

    ArrayList <Integer> valuesFromString = new ArrayList<Integer>();

    public int[] getIntFromFile(String path){
        File file = new File(path);
        IntValidationResult result;
        String temp = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine())!= null){
                result = Validation.intValidationResult(temp);
                if (result.isValid){
                    valuesFromString.addAll(result.values);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return GetArrayFromArrayList.getArray(valuesFromString);
    }
}

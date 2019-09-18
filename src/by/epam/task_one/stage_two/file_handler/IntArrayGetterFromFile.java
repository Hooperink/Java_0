package by.epam.task_one.stage_two.file_handler;

import by.epam.task_one.stage_two.validation.ValidatorResult;
import by.epam.task_one.stage_two.validation.Validator;
import by.epam.task_one.utils.ConverterFromArrayListToArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class IntArrayGetterFromFile {

    private ArrayList <Double> valuesFromString = new ArrayList<Double>();

    //TODO: double from file, not integer

    public double[] getIntFromFile(String path){
        File file = new File(path);
        ValidatorResult result;
        String temp = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine())!= null){
                result = Validator.intValidationResult(temp);
                if (result.isValid){
                    valuesFromString.addAll(result.values);
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return ConverterFromArrayListToArray.getArray(valuesFromString);
    }
}

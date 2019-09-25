package by.epam.task_one.parser;

import by.epam.task_one.array_utils.ConverterFromArrayListToArray;
import by.epam.task_one.exception.ArrayIsNullException;
import by.epam.task_one.validator.StringValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class IntArrayGetterFromFile {

    private ArrayList <Double> valuesFromString = new ArrayList<>();


    public double[] getIntFromFile(String path) throws ArrayIsNullException {
        File file = new File(path);
        String temp;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine())!= null) {
               if (StringValidator.isValid(temp)) {
                   Stream<String> stream = Pattern.compile(" ").splitAsStream(temp);
                   stream.forEach(x -> valuesFromString.add(Double.valueOf(x)));
               }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ConverterFromArrayListToArray.getArray(valuesFromString);
    }
}

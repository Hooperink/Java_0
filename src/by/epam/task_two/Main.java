package by.epam.task_two;

import by.epam.task_two.validator.StringValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        File file = new File("./resource/voucher.txt");
        StringValidator stringValidator = new StringValidator();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null){
                System.out.println(stringValidator.validate(temp));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

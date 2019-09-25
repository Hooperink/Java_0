package by.epam.task_one.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public static boolean validate(String stringFromFile) {

        if (stringFromFile == null) {
            return false;
        }

        Matcher matcher;
        String[] split = stringFromFile.split(" ");
        Pattern pattern = Pattern.compile("(\\d+\\.\\d+)|(\\b\\d+\\b)");

        for (int i = 0; i < split.length; i++) {
            matcher = pattern.matcher(split[i].trim());
            if (!matcher.matches()){
               return false;
            }
        }
        return true;
    }
}

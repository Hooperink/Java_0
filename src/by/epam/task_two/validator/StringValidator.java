package by.epam.task_two.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public boolean validate(String toValidate) {

        if (toValidate == null){
            return false;
        }

        Pattern patternVacationType = Pattern.compile("(\\s+|\\b+)Vacation type:\\s*\\w+;");
        Pattern patternTransport = Pattern.compile("(\\s+|\\b+)Transport:\\s*\\w+;");
        Pattern patternCountry = Pattern.compile("(\\s+|\\b+)Country:\\s*\\w+;");
        Pattern patternFoodType = Pattern.compile("(\\s+|\\b+)Food type:\\s*\\w+;");
        Pattern patternAmountOfDays = Pattern.compile("(\\s+|\\b+)Amount of days:\\s*\\d+;");

        Matcher matcherVacation = patternVacationType.matcher(toValidate);
        Matcher matcherTransport = patternTransport.matcher(toValidate);
        Matcher matcherCountry = patternCountry.matcher(toValidate);
        Matcher matcherFoodType = patternFoodType.matcher(toValidate);
        Matcher matcherAmountOfDays = patternAmountOfDays.matcher(toValidate);

        if (matcherAmountOfDays.find() && matcherTransport.find()
                && matcherCountry.find() && matcherVacation.find() && matcherFoodType.find()){
            return true;
        } else {
            return false;
        }
    }
}

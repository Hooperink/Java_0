package by.epam.task_two.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.task_two.regular_expressions.PatternsRegEx.*;

public class StringValidator {


    public boolean validate(String toValidate) {

        if (toValidate == null){
            return false;
        }

        Pattern patternVacationType = Pattern.compile(VACATION_TYPE_PATTERN);
        Pattern patternTransport = Pattern.compile(TRANSPORT_PATTERN);
        Pattern patternCountry = Pattern.compile(COUNTRY_PATTERN);
        Pattern patternFoodType = Pattern.compile(FOOD_TYPE_PATTERN);
        Pattern patternAmountOfDays = Pattern.compile(AMOUNT_OF_DAYS_PATTERN);

        Matcher matcherVacation = patternVacationType.matcher(toValidate);
        Matcher matcherTransport = patternTransport.matcher(toValidate);
        Matcher matcherCountry = patternCountry.matcher(toValidate);
        Matcher matcherFoodType = patternFoodType.matcher(toValidate);
        Matcher matcherAmountOfDays = patternAmountOfDays.matcher(toValidate);

        return matcherAmountOfDays.find() && matcherTransport.find()
                && matcherCountry.find() && matcherVacation.find() && matcherFoodType.find();

    }
}

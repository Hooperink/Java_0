package by.epam.task_two.parser;

import by.epam.task_two.entity.FoodType;
import by.epam.task_two.entity.TransportType;
import by.epam.task_two.entity.VacationType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.task_two.regular_expressions.PatternsRegEx.AMOUNT_OF_DAYS_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.FOOD_TYPE_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.TRANSPORT_PATTERN;
import static by.epam.task_two.regular_expressions.PatternsRegEx.VACATION_TYPE_PATTERN;

public class ValueParser {


    public TransportType getTransportType(String fileString) {
        String transportType = parseString(fileString, TRANSPORT_PATTERN);
        return TransportType.fromString(transportType);
    }


    public VacationType getVacationType(String fileString) {
        String vacationType = parseString(fileString, VACATION_TYPE_PATTERN);
        return VacationType.fromString(vacationType);
    }


    public FoodType getFoodType(String fileString){
        String foodType = parseString(fileString, FOOD_TYPE_PATTERN);
        return FoodType.fromString(foodType);
    }

    public int getAmountOfDays(String fileString) {
        return Integer.valueOf(parseString(fileString, AMOUNT_OF_DAYS_PATTERN));
    }

    public String parseString(String fileString, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcherCountry = pattern.matcher(fileString);
        return matcherCountry.find() ? matcherCountry.group(2) : "";
    }

}

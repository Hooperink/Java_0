package by.epam.task_two.regular_expressions;

public class PatternsRegEx {

    public static final String VACATION_TYPE_PATTERN = "(\\s+|\\b+)Vacation type:\\s*(\\w+)\\s*;";
    public static final String TRANSPORT_PATTERN = "(\\s+|\\b+)Transport:\\s*(\\w+)\\s*;";
    public static final String COUNTRY_PATTERN = "(\\s+|\\b+)Country:\\s*(\\w+)\\s*;";
    public static final String FOOD_TYPE_PATTERN = "(\\s+|\\b+)Food type:\\s*(\\w+\\s*\\w*);";
    public static final String AMOUNT_OF_DAYS_PATTERN = "(\\s+|\\b+)Amount of days:\\s*(\\d+)\\s*;";
    public static final String SHIP_NAME_PATTERN = "(\\s+|\\b+)Ship:\\s*(\\w+\\s*\\w*);";
    public static final String GUIDE_NAME_PATTERN = "(\\s+|\\b+)Guide:\\s*(\\w+\\s*\\w*);";
    public static final String SHOPPING_CENTERS_NAME_PATTERN = "(\\s+|\\b+)Shopping centers:\\s*(\\w+\\s*\\w*);";
    public static final String HOTEL_NAME_PATTERN = "(\\s+|\\b+)Hotel:\\s*(\\w+\\s*\\w*);;";
    public static final String MEDICAL_INSTITUTION_NAME_PATTERN = "(\\s+|\\b+)Medical institution:\\s*(\\w+\\s*\\w*);";
    private PatternsRegEx(){};
}

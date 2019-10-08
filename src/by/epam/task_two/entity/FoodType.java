package by.epam.task_two.entity;

import java.util.HashMap;
import java.util.Map;

public enum FoodType {

    NO_FOOD("No food"),
    BREAKFAST("Breakfast"),
    BUFFET("Buffet"),
    HALF_BOARD("Half board"),
    ALL_INCLUSIVE("All inclusive");

    private String foodType;
    private static final Map<String, FoodType> FOOD_TYPE_BY_NAME = new HashMap<>();

    FoodType(String foodType){
        this.foodType = foodType;
    }

    static {
        for (FoodType caseStatuses : values()) {
            FOOD_TYPE_BY_NAME.put(caseStatuses.foodType, caseStatuses);
        }
    }

    public static FoodType fromString(String value) {
        return FOOD_TYPE_BY_NAME.get(value);
    }
}
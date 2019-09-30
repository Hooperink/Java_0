package by.epam.task_two.entity;

import java.util.stream.Stream;

public enum FoodType {

    NOFOOD("No food"),
    BREAKFAST("Breakfast"),
    BUFFET("Buffet"),
    HALFBOARD("Half board"),
    ALLINCLUSIVE("All inclusive");

    private final String foodType;

    FoodType(String foodType){
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public static Stream<FoodType> stream(){
        return Stream.of(FoodType.values());
    }
}

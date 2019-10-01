package by.epam.task_two.entity;

import java.util.HashMap;

public enum  VacationType {

    EXCURSION("Excursion"),
    TREATMENT("Treatment"),
    REST("Rest"),
    SHOPPING("Shopping"),
    CAMPING("Camping"),
    CRUISE("Cruise");

    public final String type;
    private final static HashMap<String, VacationType> VACATIONS_TYPE_BY_NAME = new HashMap<>();

    VacationType(String type){
        this.type = type;
    }

    static {
        for (VacationType vacationType : values()){
            VACATIONS_TYPE_BY_NAME.put(vacationType.type, vacationType);
        }
    }

    public static VacationType fromString(String value){
        return VACATIONS_TYPE_BY_NAME.get(value);
    }
}

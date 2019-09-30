package by.epam.task_two.entity;

public enum  VacationType {

    EXCURSION("Excursion"),
    TREATMENT("Treatment"),
    REST("Rest"),
    SHOPPING("Shopping"),
    CAMPING("Camping"),
    CRUISE("Cruise");

    public final String type;

    VacationType(String type){
        this.type = type;
    }
}

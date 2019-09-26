package by.epam.task_two;

import by.epam.task_two.validator.StringValidator;

public class Main {
    public static void main(String[] args) {

        String valid = "Vacation type:asdasd;    Transport: qweqwe; Country: fghfghgfh;  Food type: qwe; Amount of days: 2;";
        StringValidator stringValidator = new StringValidator();
        System.out.println(stringValidator.validate(valid));

    }
}

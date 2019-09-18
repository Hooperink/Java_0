package by.epam.task_one.stage_two.validation;

public class Validation {

    public static IntValidationResult intValidationResult(String stringFromFile){

        IntValidationResult validationResult = new IntValidationResult();
        int temp;
        validationResult.isValid = true;

        String [] parseString = stringFromFile.split(" ");

        try {
                for (int i = 0; i < parseString.length; i++) {
                    temp = Integer.parseInt(parseString[i].trim());
                    validationResult.values.add(temp);
                }
        } catch (NumberFormatException e){
            validationResult.isValid = false;
            validationResult.values = null;
            return validationResult;
        }
            return validationResult;
    }
}
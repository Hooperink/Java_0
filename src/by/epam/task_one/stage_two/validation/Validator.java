package by.epam.task_one.stage_two.validation;

public class Validator {

    public static ValidatorResult intValidationResult(String stringFromFile){

        ValidatorResult validationResult = new ValidatorResult();
        double temp;
        validationResult.isValid = true;

        String [] parseString = stringFromFile.split(" ");

        try {
                for (int i = 0; i < parseString.length; i++) {
                    temp = Double.parseDouble(parseString[i].trim());
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

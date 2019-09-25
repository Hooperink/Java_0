package by.epam.task_one.validator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringValidatorTest {

    @DataProvider(name = "stringValidate")
    public Object[][] getStrings(){
        return new Object[][]{{"1 2 3", true}, {"3 4 ert", false}, {"3.5 3 3.543", true}, {null, false}};
    }

    @Test(dataProvider = "stringValidate")
    public void testIsValidString(String stringToValidate, boolean isValid) {
        assertEquals(isValid,StringValidator.validate(stringToValidate));
    }
}
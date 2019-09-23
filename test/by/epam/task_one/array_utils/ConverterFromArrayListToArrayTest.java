package by.epam.task_one.array_utils;

import by.epam.task_one.exception.ArrayIsNullException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ConverterFromArrayListToArrayTest {

    private ArrayList<Double> arrayList = new ArrayList<Double>();
    @BeforeClass
    public void setList(){
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.4);
        arrayList.add(4.0);
        arrayList.add(5.1);
    }

    @Test
    public void testGetArrayShouldReturnArray() throws ArrayIsNullException{
        double [] array = {1.0, 2.0, 3.4, 4.0, 5.1};
        assertEquals(ConverterFromArrayListToArray.getArray(arrayList),array);
    }

    @Test (expectedExceptions = ArrayIsNullException.class)
    public void getArrayShouldThrowExceptionWhenNullIsGiven() throws ArrayIsNullException{
        ConverterFromArrayListToArray.getArray(null);
    }
}
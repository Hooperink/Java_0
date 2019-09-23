package by.epam.task_one.array_utils;

import by.epam.task_one.exception.ArrayIsNullException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySummaryFinderTest {
    private ArraySummaryFinder arraySummaryFinder;
    private int [] array = {1, 2, 3, 4, 5};

    @BeforeClass
    public void setup(){
        arraySummaryFinder = new ArraySummaryFinder();
    }

    @Test
    public void shouldFindMax() throws ArrayIsNullException {
        int valid = arraySummaryFinder.findMax(array);
        assertEquals(valid, 5);
    }

    @Test
    public void shouldFindMin() throws ArrayIsNullException {
        int valid = arraySummaryFinder.findMin(array);
        assertEquals(valid, 1);
    }
    @Test
    public void shouldFindAverage() throws ArrayIsNullException {
        int valid = arraySummaryFinder.findAverage(array);
        assertEquals(valid, 3);
    }

    @Test (expectedExceptions = ArrayIsNullException.class)
    public void shouldThrowExceptionIfNullIsGivenInFindMax() throws ArrayIsNullException {
        arraySummaryFinder.findMax(null);
    }

    @Test (expectedExceptions = ArrayIsNullException.class)
    public void shouldThrowExceptionIfNullIsGivenInFindMin() throws ArrayIsNullException {
        arraySummaryFinder.findMin(null);
    }

    @Test (expectedExceptions = ArrayIsNullException.class)
    public void shouldThrowExceptionIfNullIsGivenInFindAverage() throws ArrayIsNullException {
        arraySummaryFinder.findAverage(null);
    }
}
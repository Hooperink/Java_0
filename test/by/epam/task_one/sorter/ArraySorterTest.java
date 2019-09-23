package by.epam.task_one.sorter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySorterTest {


    @Test
    public void testInsertionSort() {
        int [] sortedArray = {-23, 0, 3, 4};
        assertEquals(ArraySorter.insertionSort(3, 4, -23, 0),sortedArray);
    }


    @Test
    public void testInsertionSortWhenNullIsGiven() {
        assertEquals(ArraySorter.insertionSort(null),null);
    }


    @Test
    public void testSelectionSort() {
        int [] sortedArray = {-23, 0, 3, 4};
        assertEquals(ArraySorter.selectionSort(3, 4, -23, 0),sortedArray);
    }


    @Test
    public void testSelectionSortWhenNullIsGiven() {
        assertEquals(ArraySorter.selectionSort(null),null);
    }


    @Test
    public void testSortMerge() {
        int [] sortedArray = {-23, 0, 3, 4};
        assertEquals(ArraySorter.sortMerge(3, 4, -23, 0),sortedArray);
    }


    @Test
    public void testSortMergeWhenNullIsGiven() {
        assertEquals(ArraySorter.sortMerge(null),null);
    }

}
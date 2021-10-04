package com.sparta.sortingtests;

import com.sparta.sortmanager.model.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionTests {
    SelectionSort selectionSort = new SelectionSort();
    @Test
    public void testQuickSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = selectionSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }
    @Test
    public void testNanoTimeGetterWorks(){
        selectionSort.setTotalTime(500);
        assertEquals(500, selectionSort.SortNanoTime());
    }
}

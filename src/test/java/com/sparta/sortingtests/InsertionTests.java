package com.sparta.sortingtests;

import com.sparta.sortmanager.model.InsertionSort;
import com.sparta.sortmanager.model.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionTests {
    InsertionSort insertionSort = new InsertionSort();
    @Test
    public void testMergeSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = insertionSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }

    @Test
    public void testNanoTimeGetterWorks(){
        insertionSort.setTotalTime(500);
        assertEquals(500, insertionSort.SortNanoTime());
    }
}

package com.sparta.sortingtests;

import com.sparta.sortmanager.model.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTests {
    MergeSort mergeSort = new MergeSort();
    @Test
    public void testMergeSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = mergeSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }

    @Test
    public void testNanoTimeGetterWorks(){
        mergeSort.setTotalTime(500);
        assertEquals(500, mergeSort.SortNanoTime());
    }

}

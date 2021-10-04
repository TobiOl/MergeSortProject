package com.sparta.sortingtests;
import com.sparta.sortmanager.model.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class QuickTests {
    QuickSort quickSort = new QuickSort();
    @Test
    public void testQuickSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = quickSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }
    @Test
    public void testNanoTimeGetterWorks(){
        quickSort.setTotalTime(500);
        assertEquals(500, quickSort.SortNanoTime());
    }

}

package com.sparta.sortingtests;
import com.sparta.sortmanager.model.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleTests {
    BubbleSort bubbleSort = new BubbleSort();
    @Test
    public void testBubbleSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = bubbleSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }

    @Test
    public void testNanoTimeGetterWorks(){
        bubbleSort.setTotalTime(500);
        assertEquals(500, bubbleSort.SortNanoTime());
    }



}

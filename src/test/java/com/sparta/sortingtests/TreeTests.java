package com.sparta.sortingtests;
import com.sparta.sortmanager.model.BinaryTreeSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TreeTests {
    BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
    @Test
    public void testTreeSortWorks(){

        int[] testArray = {5,2,89,43,1};
        int[] result = binaryTreeSort.Sort(testArray);
        int[] expectedResult = {1,2,5,43,89};
        assertArrayEquals(expectedResult,result);
    }
    @Test
    public void testNanoTimeGetterWorks(){
        binaryTreeSort.setTotalTime(500);
        assertEquals(500, binaryTreeSort.SortNanoTime());
    }
}

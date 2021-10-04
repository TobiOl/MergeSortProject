package com.sparta.sortingtests;

import com.sparta.sortmanager.model.GenerateArray;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateArrayTest {
    @Test
    public void testRandomArrayGeneration(){
        Random random = new Random();
        random.setSeed(29);
        int[] result = GenerateArray.generateIntArray(10, random);
        int[] expectedResult = {83,84,21,1,49,51,15,22,87,75};
        assertArrayEquals(expectedResult,result);
    }
}

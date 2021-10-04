package com.sparta.sortmanager.model;

import java.util.Random;

public class GenerateArray {
    public static int[] generateIntArray(int arrayLength, Random randNumGen) {
        int[] myArr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = randNumGen.nextInt(100);
        }

        return myArr;
    }
}

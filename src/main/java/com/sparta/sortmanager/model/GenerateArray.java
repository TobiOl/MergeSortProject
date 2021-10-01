package com.sparta.sortmanager.model;

import java.util.Random;

public class GenerateArray {
    public static int[] generateIntArray(int arrayLength) {
        int[] myArr = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = r.nextInt(100);
        }
        return myArr;
    }
}

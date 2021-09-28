package com.sparta.sortmanager;

import java.util.Arrays;

public class SortManagerView {
    public static void SortView(){
        System.out.println("Enter a value to choose a sort");

        //PrintOutput(unsortedArray, SortedArr);
    }

    public static void PrintOutput(int[] Unsorted, int[] SortedArr){
        System.out.println("Unsorted Array: " + Arrays.toString(Unsorted));
        System.out.println("Sorted Array: " + Arrays.toString(SortedArr));
    }
}

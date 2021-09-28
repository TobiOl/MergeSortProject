package com.sparta.sortmanager;

import java.util.Random;
import java.util.Scanner;

public class SortManagerMain {

    public static void main(String[] args) {
        System.out.println("Enter a value to choose a sort");
        Scanner val1 = new Scanner((System.in));
        int choice = val1.nextInt();
        int[] unsortedArray = generateIntArray(choice);
        SortChoice sorting = null;
        switch (choice){
            case 1:
            sorting = new BubbleSort();
        }
        int[] BubbleSortedArr= BubbleSort.Sort(unsortedArray);


    }

    public static int[] generateIntArray(int arrayLength) {
        int[] myArr = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArr[i] = r.nextInt(100);
        }
        return myArr;
    }

    public void Output(int[] Unsorted){
        System.out.println("Unsorted Array: " + Unsorted);

    }
}

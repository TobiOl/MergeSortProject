package com.sparta.sortmanager;

import java.io.IOException;
import java.util.Arrays;

public class SortManagerView {

    public static void SortView(){
        long endTime;
        SortManagerController SMC = new SortManagerController();
        System.out.println("Choose a sorting algorithm");
        SMC.chooseSort();
        System.out.println("Chosen sorting algorithm is: " + SMC.getChoice1());
        SortChoice sorting = null;
        SortTiming sortTime = null;
        switch (SMC.getChoice1()){
            case "BubbleSort":
                sorting = new BubbleSort();
                break;
            case "MergeSort":
                sorting = new MergeSort();
                break;
        }
        int[] SortedArr= sorting.Sort(SMC.getUnsortedArray());

        endTime = sorting.SortNanoTime();
        PrintOutput(SMC.getUnsortedArray(), SortedArr, endTime);
    }

    public static void PrintOutput(int[] Unsorted, int[] SortedArr, long endTime){
        System.out.println("----------------Unsorted Algorithm-----------");
        for(int number: Unsorted){
            System.out.print(number + ", ");
        }
        System.out.println("\n");
        System.out.println("----------------Sorted Algorithm-----------");
        for(int number: SortedArr){
            System.out.print(number + ", ");
        }
        System.out.println("\n Total time taken is: " + endTime + " nano seconds");
    }
}

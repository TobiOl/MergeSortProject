package com.sparta.sortmanager;

import java.util.Arrays;

public class SortManagerView {
    public static void SortView(){
        SortManagerController SMC = new SortManagerController();
        System.out.println("Choose a sorting algorithm");
        SMC.chooseSort();
        SortChoice sorting = null;
        switch (SMC.getChoice1()){
            case "ArrayList":
                sorting = new BubbleSort();
        }
        int[] SortedArr= sorting.Sort(SMC.getUnsortedArray());

        PrintOutput(SMC.getUnsortedArray(), SortedArr);
    }

    public static void PrintOutput(int[] Unsorted, int[] SortedArr){
        for(int number: SortedArr){
            System.out.print(number + ", ");
        }
    }
}

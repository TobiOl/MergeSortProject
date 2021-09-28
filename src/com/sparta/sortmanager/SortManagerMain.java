package com.sparta.sortmanager;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortManagerMain {

    public static void main(String[] args) {
        SortManagerView.SortView();

        Scanner val1 = new Scanner((System.in));
        Scanner val2 = new Scanner((System.in));
        String choice1 = val1.next();
        int choice2 = val2.nextInt();
        int[] unsortedArray = GenerateArray.generateIntArray(choice2);
        SortChoice sorting = null;
        switch (choice1){
            case "ArrayList":
            sorting = new BubbleSort();
        }
        int[] SortedArr= sorting.Sort(unsortedArray);
        for(int number: SortedArr){
            System.out.print(number + ", ");
        }


    }




}

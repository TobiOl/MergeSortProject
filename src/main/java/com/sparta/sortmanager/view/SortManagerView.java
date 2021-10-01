package com.sparta.sortmanager.view;

import com.sparta.sortmanager.controller.SortManagerController;
import com.sparta.sortmanager.model.BubbleSort;
import com.sparta.sortmanager.model.MergeSort;
import com.sparta.sortmanager.model.QuickSort;
import com.sparta.sortmanager.model.SortChoice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortManagerView {

    public static void SortView(){

        long endTime;
        String val1 = null;
        int val2 = 0;
        SortManagerController SMC = new SortManagerController();
        System.out.println("Choose a sorting algorithm");
        try{
            Scanner input = new Scanner((System.in));
            val1 = input.next();
            val2 = input.nextInt();
            SMC.SortValStore(val1, val2);

        } catch (NullPointerException npe){
            System.err.println("Null detected!");
        } catch (InputMismatchException ime){
            System.err.println("Input mismatch detected! Use letters for the first entry and numbers for the second only!");
        }
        System.out.println("Chosen sorting algorithm is: " + SMC.getChoice1());

        SortChoice sorting = null;
        switch (SMC.getChoice1()){
            case "BubbleSort":
                sorting = new BubbleSort();
                break;
            case "MergeSort":
                sorting = new MergeSort();
                break;
            case "QuickSort":
                sorting = new QuickSort();
                break;
        }
        //copies the array over so it doesnt change the original
        int[] unsortedArray = SMC.getUnsortedArray();
        int [] unsortedCopy = SMC.getUnsortedArray();
        int[] unsortedCopyNum = new int[SMC.getChoice2()];
        System.arraycopy(unsortedArray, 0, unsortedCopyNum, 0, SMC.getChoice2());
        SMC.setUnsortedArray(unsortedCopyNum);

        int[] sortedArr= sorting.Sort(unsortedCopy);//sends the copy to be sorted
        endTime = sorting.SortNanoTime();


        PrintOutput(unsortedCopyNum, sortedArr, endTime);
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

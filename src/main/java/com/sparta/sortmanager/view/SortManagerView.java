package com.sparta.sortmanager.view;

import com.sparta.sortmanager.controller.SortManagerController;
import com.sparta.sortmanager.model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class SortManagerView {
    private static Logger logger = Logger.getLogger("Sort Manager Logger");
    public static void SortView(){
        PropertyConfigurator.configure("logfj.properties");
        long endTime;
        String sortChoice = null;
        int userArraySize = 0;
        SortManagerController SMC = new SortManagerController();
        System.out.println("Choose a sorting algorithm");
        try{
            Scanner input = new Scanner((System.in));
            sortChoice = input.next();
            logger.debug("User has entered " + sortChoice + " as their first value");
            userArraySize = input.nextInt();
            logger.debug("User has entered " + userArraySize + " as their second value");
            SMC.SortValStore(sortChoice, userArraySize);

        } catch (NullPointerException npe){
            System.err.println("Null detected!");
            logger.error("User has entered a null value");

        } catch (InputMismatchException ime){
            System.err.println("Input mismatch detected! Use letters for the first entry and numbers for the second only!");
            logger.error("User has entered mismatched value types. A string was expected for the first and an int for the second.");
        }
        System.out.println("Chosen sorting algorithm is: " + SMC.getUserSortChoice());

        SortChoice sorting = null;
        switch (SMC.getUserSortChoice()){
            case "BubbleSort":
                sorting = new BubbleSort();
                logger.warn("Loading BubbleSort algorithm...");
                break;
            case "MergeSort":
                sorting = new MergeSort();
                logger.warn("Loading MergeSort algorithm...");
                break;
            case "QuickSort":
                sorting = new QuickSort();
                logger.warn("Loading QuickSort algorithm...");
                break;
            case "TreeSort":
                sorting = new BinaryTreeSort();
                logger.warn("Loading QuickSort algorithm...");
                break;
        }
        //copies the array over so it doesnt change the original
        int[] unsortedArray = SMC.getUnsortedArray();
        int [] unsortedCopy = SMC.getUnsortedArray();
        int[] unsortedCopyNum = new int[SMC.getUserArraySize()];
        System.arraycopy(unsortedArray, 0, unsortedCopyNum, 0, SMC.getUserArraySize());
        SMC.setUnsortedArray(unsortedCopyNum);

        int[] sortedArr= sorting.Sort(unsortedCopy);//sends the copy to be sorted
        endTime = sorting.SortNanoTime();


        PrintOutput(unsortedCopyNum, sortedArr, endTime);
    }

    public static void PrintOutput(int[] Unsorted, int[] SortedArr, long endTime){
        String repeat;
        logger.warn("Printing final results");
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

        System.out.println("Do you want to repeat? (Y/N)");
        Scanner input = new Scanner((System.in));
        repeat = input.next();
        if (repeat.equals("Y")||repeat.equals("y")){
            SortView();
        }
        else{
            System.out.println("End program.");
        }

    }
}

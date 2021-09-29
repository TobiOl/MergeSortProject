package com.sparta.sortmanager;

import java.util.Scanner;

public class SortManagerController {
    private String choice1;
    private int choice2;
    private int[] unsortedArray;

    public SortManagerController(String choice1, int choice2, int[] unsortedArray) {
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.unsortedArray = unsortedArray;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }
    public int getChoice2() {
        return choice2;
    }

    public void setChoice2(int choice2) {
        this.choice2 = choice2;
    }

    public int[] getUnsortedArray() {
        return unsortedArray;
    }

    public void setUnsortedArray(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public void chooseSort(){
        Scanner val1 = new Scanner((System.in));
        Scanner val2 = new Scanner((System.in));
        setChoice1(val1.next());
        setChoice2(val2.nextInt());
        setUnsortedArray(GenerateArray.generateIntArray(choice2));
    }
}

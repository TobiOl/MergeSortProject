package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.GenerateArray;

import java.util.Arrays;
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

    public SortManagerController() {
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

        public void SortValStore(String val1, int val2){


        this.setChoice1(val1);
        this.setChoice2(val2);
        this.setUnsortedArray(GenerateArray.generateIntArray(this.getChoice2()));



    }

    @Override
    public String toString() {
        return "SortManagerController{" +
                "unsortedArray=" + Arrays.toString(unsortedArray) +
                '}';
    }
}

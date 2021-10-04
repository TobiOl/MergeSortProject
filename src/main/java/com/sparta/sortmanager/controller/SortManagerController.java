package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.GenerateArray;

import java.util.Arrays;
import java.util.Random;

public class SortManagerController {
    private String userSortChoice;
    private int userArraySize;
    private int[] unsortedArray;

    public SortManagerController(String userSortChoice, int userArraySize, int[] unsortedArray) {
        this.userSortChoice = userSortChoice;
        this.userArraySize = userArraySize;
        this.unsortedArray = unsortedArray;

    }

    public SortManagerController() {
    }

    public String getUserSortChoice() {
        return userSortChoice;
    }

    public void setUserSortChoice(String userSortChoice) {
        this.userSortChoice = userSortChoice;
    }
    public int getUserArraySize() {
        return userArraySize;
    }

    public void setUserArraySize(int userArraySize) {
        this.userArraySize = userArraySize;
    }

    public int[] getUnsortedArray() {
        return unsortedArray;
    }

    public void setUnsortedArray(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

        public void SortValStore(String val1, int val2){
        Random random = new Random();
        this.setUserSortChoice(val1);
        this.setUserArraySize(val2);

        this.setUnsortedArray(GenerateArray.generateIntArray(this.getUserArraySize(), random));



    }



    @Override
    public String toString() {
        return "SortManagerController{" +
                "unsortedArray=" + Arrays.toString(unsortedArray) +
                '}';
    }
}

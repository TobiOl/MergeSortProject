package com.sparta.sortmanager;

public class BubbleSort implements SortChoice{

    @Override
    public int[] Sort(int[] unsortArr) {
        int n = unsortArr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (unsortArr[j] > unsortArr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = unsortArr[j];
                    unsortArr[j] = unsortArr[j+1];
                    unsortArr[j+1] = temp;
                }
        return unsortArr;
    }


}

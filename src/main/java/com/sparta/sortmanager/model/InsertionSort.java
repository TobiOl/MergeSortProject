package com.sparta.sortmanager.model;

public class InsertionSort implements SortChoice{
    private long totalTime;


    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int[] Sort(int[] unsortArr) {
        long startTime = System.nanoTime();
        long endTime;
        int n = unsortArr.length;
        for (int i = 1; i < n; ++i) {
            int key = unsortArr[i];
            int j = i - 1;

            while (j >= 0 && unsortArr[j] > key) {
                unsortArr[j + 1] = unsortArr[j];
                j = j - 1;
            }
            unsortArr[j + 1] = key;
        }
        endTime = System.nanoTime();
        setTotalTime(endTime - startTime);
        return unsortArr;
    }

    @Override
    public long SortNanoTime() {
        return getTotalTime();
    }
}

package com.sparta.sortmanager;

public class BubbleSort implements SortChoice{
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
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (unsortArr[j] > unsortArr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = unsortArr[j];
                    unsortArr[j] = unsortArr[j+1];
                    unsortArr[j+1] = temp;
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

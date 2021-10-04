package com.sparta.sortmanager.model;

public class SelectionSort implements SortChoice{
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

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (unsortArr[j] < unsortArr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = unsortArr[min_idx];
            unsortArr[min_idx] = unsortArr[i];
            unsortArr[i] = temp;
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

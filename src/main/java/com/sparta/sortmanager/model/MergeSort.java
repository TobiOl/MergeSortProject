package com.sparta.sortmanager.model;

public class MergeSort implements SortChoice{
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
        if(unsortArr.length > 1)
        {
            int mid = unsortArr.length / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = unsortArr[i];
            }

            // Split right part
            int[] right = new int[unsortArr.length - mid];
            for(int i = mid; i < unsortArr.length; i++)
            {
                right[i - mid] = unsortArr[i];
            }
            Sort(left);
            Sort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    unsortArr[k] = left[i];
                    i++;
                }
                else
                {
                    unsortArr[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                unsortArr[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                unsortArr[k] = right[j];
                j++;
                k++;
            }
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

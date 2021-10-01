package com.sparta.sortmanager.model;

public class QuickSort implements SortChoice{
    private long totalTime;


    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public void quickSort(int[] numbers, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = numbers[(left + right) / 2];
        /* partition */
        while (i <= j)
        {
            while (numbers[i] < pivot)
                i++;
            while (numbers[j] > pivot)
                j--;
            if (i <= j)
            {
                tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
            }
        };

        /* recursion */
        if (left < j)
            quickSort(numbers, left, j);

        if (i < right)
            quickSort(numbers, i, right);
    }
    @Override
    public int[] Sort(int[] unsortArr) {
        long startTime = System.nanoTime();
        long endTime;
        int i = 0, j = (unsortArr.length-1);
        int tmp;
        int pivot = unsortArr[(0 + (unsortArr.length)) / 2];
        /* partition */
        while (i <= j)
        {
            while (unsortArr[i] < pivot)
                i++;
            while (unsortArr[j] > pivot)
                j--;
            if (i <= j)
            {
                tmp = unsortArr[i];
                unsortArr[i] = unsortArr[j];
                unsortArr[j] = tmp;
                i++;
                j--;
            }
        };

        /* recursion */
        if (0 < j)
            quickSort(unsortArr, 0, j);

        if (i < unsortArr.length-1)
            quickSort(unsortArr, i, unsortArr.length-1);

        endTime = System.nanoTime();
        setTotalTime(endTime - startTime);
        return unsortArr;
    }

    @Override
    public long SortNanoTime() {
        return getTotalTime();
    }
}

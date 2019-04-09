package com.github.wojTechM.threadsDemo;

import java.util.List;

/**
 * @author Makiela Wojciech
 */
class Quicksort {

    <T extends Comparable<T>> void sort(List<T> toSort) {
        if (toSort == null) {
            throw new IllegalArgumentException("Cannot sort null");
        }
        int start = 0;
        int end = toSort.size() - 1;
        sort(toSort, start, end);
    }

    private <T extends Comparable<T>> void sort(List<T> toSort, int start, int end) {
        if (start < end) {
            int pivot = splitAndSort(toSort, start, end);
            sort(toSort, start, pivot - 1);
            sort(toSort, pivot + 1, end);
        }
    }

    private <T extends Comparable<T>> int splitAndSort(List<T> toSort, int start, int end) {
        int indexOfAPivot = (start + end) / 2;
        T pivotValue = toSort.get(indexOfAPivot);

        swapValues(toSort, indexOfAPivot, end);

        int swapIndex = start;

        for (int i = start; i < end; i++) {
            T elemToCompare = toSort.get(i);
            if (elemToCompare.compareTo(pivotValue) < 0) {
                swapValues(toSort, i, swapIndex);
                swapIndex++;
            }
        }

        swapValues(toSort, swapIndex, end);
        return swapIndex;
    }

    private <T extends Comparable<T>> void swapValues(List<T> toSort, int first, int second) {
        T temp = toSort.get(first);
        toSort.set(first, toSort.get(second));
        toSort.set(second, temp);
    }
}

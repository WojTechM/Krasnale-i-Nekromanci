package com.github.wojTechM.threadsDemo;

import io.github.sskorol.core.DataSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class SortedListsGenerator {

    @DataSupplier
    public Stream<List<Integer>> getSortedLists() {
        List<List<Integer>> sortedLists = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            sortedLists.add(getSortedListOfIntegers());
        }
        return sortedLists.stream();
    }

    private List<Integer> getSortedListOfIntegers() {
        List<Integer> listOfIntegers = new ArrayList<>();
        int lastAdded = ThreadLocalRandom.current().nextInt(200);
        listOfIntegers.add(lastAdded);

        addNewElements(listOfIntegers, lastAdded);

        return listOfIntegers;
    }

    private void addNewElements(List<Integer> listOfIntegers, int lastAdded) {
        for (int i = 0; i < 40; i++) {
            lastAdded += ThreadLocalRandom.current().nextInt(200);
            listOfIntegers.add(lastAdded);
        }
    }
}
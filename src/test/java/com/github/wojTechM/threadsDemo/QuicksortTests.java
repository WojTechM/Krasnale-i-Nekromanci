package com.github.wojTechM.threadsDemo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Makiela Wojciech
 */
public class QuicksortTests {

    private final static Quicksort quicksort = new Quicksort();

    @Test(dataProvider = "getSortedLists", dataProviderClass = SortedListsGenerator.class)
    public void should_doNothing_when_passedAlreadySortedList(List<Integer> sortedList) {
        // arrange
        List<Integer> copy = new ArrayList<>(sortedList);

        // act
        quicksort.sort(copy);

        // assert
        assert sortedList.equals(copy) : String.format("Expected %s\ngot %s", sortedList, copy);
    }

    @Test
    public void should_doNothing_when_passedEmptyList(){
        // arrange
        List<String> toSort = new ArrayList<>();
        List<String> copy = new ArrayList<>();

        // act
        quicksort.sort(copy);

        // assert
        assert toSort.equals(copy) : String.format("Expected %s\ngot %s", toSort, copy);
    }

    @Test(dataProvider = "getSortedLists", dataProviderClass = SortedListsGenerator.class)
    public void should_sortTheList_when_passedUnsortedList(List<Integer> sortedList) {
        // arrange
        List<Integer> copy = new ArrayList<>(sortedList);
        Collections.shuffle(copy);

        // act
        quicksort.sort(copy);

        // assert
        assert sortedList.equals(copy) : String.format("\nExpected %s\ngot %s", sortedList, copy);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void should_throwIllegalArgumentException_when_passedNull(){
        // act
        quicksort.sort(null);
    }
}
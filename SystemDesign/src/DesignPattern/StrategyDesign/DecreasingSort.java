package DesignPattern.StrategyDesign;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DecreasingSort implements SortingStrategy {
    @Override
    public void sort(List<Integer> arr) {
        System.out.println("Sorting array in decreasing order");
        Collections.sort(arr, Comparator.reverseOrder());
    }
}

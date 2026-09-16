package DesignPattern.StrategyDesign;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class IncreasingSort implements SortingStrategy{
    @Override
    public void sort(List<Integer> arr) {
        System.out.println("Sorting array in increasing order");
        Collections.sort(arr);
    }
}

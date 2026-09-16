package DesignPattern.StrategyDesign;

import java.util.*;
import java.lang.*;
import java.util.List;
import java.util.Collections;

public class WavySort implements SortingStrategy {

    @Override
    public void sort(List<Integer> arr) {
        System.out.println("Sorting array in wavy order");

        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (i % 2 == 0) {
                if (arr.get(i) > arr.get(i + 1)) {
                    Collections.swap(arr, i, i + 1);
                }
            } else {
                if (arr.get(i) < arr.get(i + 1)) {
                    Collections.swap(arr, i, i + 1);
                }
            }
        }
    }
}
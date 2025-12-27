package DesignPattern.StrategyDesign;

import java.util.List;

public class Context {
    SortingStrategy strategy;
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> nums) {
        strategy.sort(nums);
    }
}

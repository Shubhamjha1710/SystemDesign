package DesignPattern.StrategyDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // Client
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,6,7,5,3,4,9,8,10));

        // By using context class client only needs to change the strategy don't need to handle
        // new different strategy objects and don't need to know strategy internal function.
        Context ctx = new Context();
        ctx.setStrategy(new IncreasingSort());
        ctx.sort(nums);
        System.out.println(nums);

        ctx.setStrategy(new DecreasingSort());
        ctx.sort(nums);
        System.out.println(nums);

        ctx.setStrategy(new WavySort());
        ctx.sort(nums);
        System.out.println(nums);
    }
}

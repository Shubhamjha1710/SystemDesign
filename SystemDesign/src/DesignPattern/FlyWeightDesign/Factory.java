package DesignPattern.FlyWeightDesign;

import java.util.*;

public class Factory {
    private Map<String, StoneFlyweight> flyweightStoneMap = new HashMap<String, StoneFlyweight>();

    Factory() {
        flyweightStoneMap = new HashMap<String, StoneFlyweight>();
    }

    private String GetFlyweightStoneKey(String color, int wt, String mat) {
        return color + "__" + String.valueOf(wt) + "__" + mat;
    }

    public StoneContext CreateStone(String color, int wt, String mat, int location) {
        String key = GetFlyweightStoneKey(color, wt, mat);
        if(!flyweightStoneMap.containsKey(key)) {
            flyweightStoneMap.put(key, new StoneFlyweight(color, wt, mat));
        }

        StoneFlyweight stoneFlyweight = flyweightStoneMap.get(key);

        return new StoneContext(
                stoneFlyweight,
                location
        );
    }
}

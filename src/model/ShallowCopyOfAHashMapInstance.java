package model;

import java.util.HashMap;
import java.util.Map;

public class ShallowCopyOfAHashMapInstance {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "blue");
        map.put(2, "black");
        map.put(3, "red");
        Map<Integer, String> map2 = new HashMap<>(map);
        System.out.println(map2);

    }
}

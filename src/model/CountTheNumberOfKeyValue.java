package model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfKeyValue {
    Map<Integer, String> map = new HashMap<>();

    public void create() {
        map.put(1, "blue");
        map.put(2, "black");
        map.put(3, "red");

    }

    public void ouput() {
        System.out.println(map.size());
    }

    public static void main(String[] args) {
        CountTheNumberOfKeyValue countTheNumberOfKeyValue = new CountTheNumberOfKeyValue();
        countTheNumberOfKeyValue.create();
        countTheNumberOfKeyValue.ouput();
    }
}

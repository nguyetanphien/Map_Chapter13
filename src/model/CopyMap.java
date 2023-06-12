package model;

import java.util.HashMap;
import java.util.Map;

public class CopyMap {
    Map<Integer, String> map = new HashMap<>();
    Map<Integer, String> map2 = new HashMap<>();
    public void create() {
        map.put(1, "blue");
        map.put(2, "black");
        map.put(3, "red");

    }
    public void copy(){
        map2.putAll(map);
    }
    public void ouput() {
        copy();
        System.out.println(map2);
    }

    public static void main(String[] args) {
        CopyMap copyMap=new CopyMap();
        copyMap.create();
        copyMap.ouput();
    }
}

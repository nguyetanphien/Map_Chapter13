package model;

import java.util.HashMap;
import java.util.Map;

public class AssociateTheSpecifiedValue {
    Map<Integer, String> map = new HashMap<>();

    public void create() {
        map.put(1, "blue");
        map.put(2, "black");
        map.put(3, "red");

    }

    public void ouput() {
        System.out.println(map);
    }

    public static void main(String[] args) {
        AssociateTheSpecifiedValue associateTheSpecifiedValue = new AssociateTheSpecifiedValue();
        associateTheSpecifiedValue.create();
        associateTheSpecifiedValue.ouput();
    }
}

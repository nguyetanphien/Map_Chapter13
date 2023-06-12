package model;

import java.util.HashMap;
import java.util.Map;

public class TestContainKey {
    Map<Integer, String> map = new HashMap<>();

    public void create() {
        map.put(1, "blue");
        map.put(2, "black");
        map.put(3, "red");

    }
    public void testContainKey(){
        int test=1;
        if(map.containsKey(test))
            System.out.println("true");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        TestContainKey testContainKey=new TestContainKey();
        testContainKey.create();
        testContainKey.testContainKey();
    }
}

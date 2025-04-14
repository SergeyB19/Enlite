package com.example.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTask {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("ABC", 14);
        map.put("Milan", 123);
        map.put("Paris", 234);

        System.out.println(map.get("ABC"));
        System.out.println(map.get("Milan"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            map.put("Paris", 567);
            System.out.println(map.get("Paris"));
        }
        System.out.println();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("ABC", 14);
        map2.put("Milan", 123);
        map2.put("AAA", 234);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            map.put("Paris", 567);
            System.out.println(map.get("Paris"));
        }

        System.out.println();
        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("ABC", 14);
        map3.put("Milan", 123);
        map3.put("AAA", 234);
        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            map.put("Paris", 567);
            System.out.println(map.get("Paris"));
        }
    }
}

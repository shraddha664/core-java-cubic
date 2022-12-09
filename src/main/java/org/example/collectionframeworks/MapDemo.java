package org.example.collectionframeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
//        Implemenetation of HashMap
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Saru");
        map.put("actor", "decaprio");
        map.put("color", "black");

        System.out.println(map);
        System.out.println(map.get("myName"));
//        KeySet returns the set of keys of that particular map
        Set<String> keys = map.keySet();
//        fetching all the key values of map one by one
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));

        }
//        implementation of TreeMap
        Map<String, String> tmap = new TreeMap<>();
        tmap.put("myName", "Saru");
        tmap.put("actor", "decaprio");
        tmap.put("color", "black");

        System.out.println(tmap);
        System.out.println(tmap.get("myName"));

//        KeySet returns the set of keys of that particular map
        Set<String> tkeys = tmap.keySet();
        //        fetching all the key values of map one by one

        for (String tkey : tkeys) {
            System.out.println(tkey + " " + tmap.get(tkey));
        }

    }
}


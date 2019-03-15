package com.prash;

import com.sun.org.apache.xerces.internal.xs.StringList;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class MyMapClass {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("One", "First");
        map.put("Two", "Second");
        map.put("Three", "Third");
        System.out.println("=====" + map);// Prints the Map values
        Set<String> keys = map.keySet(); // Returns all the keys in the Map
        //Iterate over the Keys
        for (String key: keys) {
            System.out.println("Value of Key is " + key);
        }

        //Find whether Key exists
        if (map.containsKey("Three")) {
            System.out.println("Key exists");
        }
        if (map.containsValue("Second")) {
            System.out.println("Value found");
        }

        //Get Both values and keys from the map
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for( Map.Entry<String, String> entry: entrySet) {
            System.out.println("Key =" + entry.getKey() +" ------------- value =" + entry.getValue());
        }

        //Sorting HashMap
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(9, "ZZZZZZZZZZZZZ");
        mapValues.put(6 , "BBBBBBBBBBBB");
        mapValues.put(2, "PPPPPPPPPPPp");
        mapValues.put(8, "AAAAAAAAAAAAAA");

        TreeMap<Integer, String> treeMap = new TreeMap<>(mapValues);
        System.out.println("Sorted map by keys=" + treeMap);
//        Set<Map.Entry<Integer, String>> entries = mapValues.entrySet();

        //Sorting map by Values
        Comparator<Map.Entry<Integer, String>> valueCOmparator = new Comparator<Map.Entry<Integer, String>> () {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        Set<Map.Entry<Integer, String>> entries = mapValues.entrySet();
        List<Map.Entry<Integer, String>> listEntries = new ArrayList<>(entries);// COnverting to List to pass to Collections.sort meth
        Collections.sort(listEntries, valueCOmparator);
        System.out.println("Sorted List=" + listEntries);
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : listEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map by Values==>" + sortedMap);

//        Set<String> sets = new HashSet<>();
//        sets.add("DC");
//        sets.add("FA");
//        sets.add("CF");
//        sets.add("AZ");
//        System.out.println("--" + sets);
//        TreeSet<String> tree = new TreeSet<>(sets);
//        System.out.println("==" + tree);

//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        hm.put("Naveen", 2);
//        hm.put("Santosh", 3);
//        hm.put("Ravi", 4);
//        hm.put("Pramod", 1);
//        Set<Map.Entry<String, Integer>> set = hm.entrySet();
//        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
//                set);
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getValue());
//
//        }
    }
}

package com.prash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void tempMeth() {
        String[] str = {"My", "Name", "Is", "David"};
        List<String> lst = Arrays.asList(str);
        System.out.println("lst" + lst);
        Arrays.sort(str);
        for (String strng: str) {
            System.out.println("==" + strng);
        }

        // Sort and search a "List" of Integers
        List<Integer> integerist = new ArrayList<Integer>();
        integerist.add(70);
        integerist.add(40);
        integerist.add(30);
        integerist.add(90);

        System.out.println("-"+ integerist);
        Collections.sort(integerist);
        System.out.println("==" + integerist);
        System.out.println(Collections.binarySearch(integerist, 70));
    }

    public static void main(String[] args) {
        tempMeth();
    }
}

package com.abhilive.javafundamentals.customKeyHashMap;

import java.util.HashMap;

public class CustomKeyHashMapMain {

    public static void main(String[] args) {
        HashMap<CustomKeyHashMap, String> map = new HashMap<>();
        CustomKeyHashMap e1 = new CustomKeyHashMap(1, "Alice");
        CustomKeyHashMap e2 = new CustomKeyHashMap(2, "Bob");

        map.put(e1, "New York");
        map.put(e2, "London");

        System.out.println(map.get(e1));
    }
}

package com.abhilive.javafundamentals.customKeyHashMap;

import java.util.Objects;

public class CustomKeyHashMap {

    int id;
    String name;

    public CustomKeyHashMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        CustomKeyHashMap customKeyHashMap = (CustomKeyHashMap) o;
        return id == customKeyHashMap.id && Objects.equals(name, customKeyHashMap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

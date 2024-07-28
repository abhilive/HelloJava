package com.abhilive.javafundamentals;

import java.util.HashMap;
import java.util.Map;

final class ImmutableStudentClass {

    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public ImmutableStudentClass(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempData = new HashMap<>();
        for(Map.Entry<String, String> entry : metadata.entrySet()) {
            tempData.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempData;
    }

    public String getName() { return name; }

    public int getRegNo() { return regNo; }

    public Map<String, String> getMetadata() {
        Map<String, String> tempData = new HashMap<>();
        for(Map.Entry<String, String> entry : this.metadata.entrySet()) {
            tempData.put(entry.getKey(), entry.getValue());
        }
        return tempData;
    }

}

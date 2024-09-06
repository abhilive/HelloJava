package com.abhilive.javafundamentals;

import com.abhilive.javafundamentals.model.ActuatorResponse;

import java.util.*;
import java.util.stream.Collectors;

public class ActuatorResponseFilter {

    public static void main(String[] args) {
        HashMap<String, ActuatorResponse> responses = new HashMap<>();
        responses.put("siteA", new ActuatorResponse("siteA", 123L, "127.0.0.1", "started"));
        responses.put("siteB", new ActuatorResponse("siteB", 456L, "127.0.0.2", "started"));
        responses.put("siteC", new ActuatorResponse("siteC", 789L, "127.0.5.3", "started"));
        responses.put("siteD", new ActuatorResponse("siteD", 230L, "127.0.0.4", "started"));

        Map<String, ActuatorResponse> filteredResponses = responses.entrySet().stream()
                .filter(a -> a.getValue().getIpAddress().contains("127.0.0"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // sort the map by values - convert the map's entry set to a list, sort the list by values, and
        // then put the sorted entries back into a new map that preserves the order.
        List<Map.Entry<String, ActuatorResponse>> entryList = new ArrayList<>(filteredResponses.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, ActuatorResponse>>() {
            @Override
            public int compare(Map.Entry<String, ActuatorResponse> o1, Map.Entry<String, ActuatorResponse> o2) {
                return o1.getValue().getId().compareTo(o2.getValue().getId());
            }
        });

        Map<String, ActuatorResponse> sortedMapByValue = new LinkedHashMap<>();
        for (Map.Entry<String, ActuatorResponse> entry : entryList) {
            sortedMapByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sort the map by keys using TreeMap");

        Map<String, ActuatorResponse> sortedFilteredResponses = new TreeMap<>(filteredResponses);

        sortedFilteredResponses.forEach((k,v) -> System.out.println("key: "+k+" value: "+v));

    }
}

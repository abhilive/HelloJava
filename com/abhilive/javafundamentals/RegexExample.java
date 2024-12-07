package com.abhilive.javafundamentals;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String input = "21:56176817817\n32A:12122024USD10000,00";

        // Define the regex pattern
        String regex = "(\\d{8})([A-Z]{3})(\\d{1,3}(?:,\\d{3})*(?:\\.\\d{2})?)";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Match and extract
        if (matcher.find()) {
            String date = matcher.group(1);        // 12122024
            String currency = matcher.group(2);   // USD
            String amount = matcher.group(3);     // 10000,00

            System.out.println("Date: " + date);
            System.out.println("Currency: " + currency);
            System.out.println("Amount: " + amount);
        } else {
            System.out.println("No match found.");
        }
    }
}


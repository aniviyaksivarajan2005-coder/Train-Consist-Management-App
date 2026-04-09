package com.train.consist;

import java.util.*;
import java.util.stream.Collectors;

public class TrainApp {

    // Inner class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create list
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));
        bogieList.add(new Bogie("General", 90));
        bogieList.add(new Bogie("Second Sitting", 100));

        // Step 2: Group bogies (example: High vs Low capacity)
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(
                        b -> (b.capacity > 60) ? "High Capacity" : "Low Capacity"
                ));

        // Step 3: Display grouped data
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");

            for (Bogie b : entry.getValue()) {
                System.out.println(b.name + " → " + b.capacity + " seats");
            }
        }
    }
}
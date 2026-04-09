package com.train.consist;

import java.util.ArrayList;
import java.util.List;
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

        // Step 2: Convert to stream and filter
        List<Bogie> filteredList = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");

        for (Bogie b : filteredList) {
            System.out.println(b.name + " → " + b.capacity + " seats");
        }
    }
}
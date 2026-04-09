package com.train.consist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainApp {

    // Inner class (Bogie)
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // UC7: Sorting bogies using Comparator
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create List
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        // Step 3: Sort bogies by capacity
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("\nSorted Bogies (by capacity):");

        for (Bogie b : bogieList) {
            System.out.println(b.name + " → " + b.capacity + " seats");
        }
    }
}
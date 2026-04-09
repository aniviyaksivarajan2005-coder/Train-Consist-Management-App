package com.train.consist;

import java.util.ArrayList;
import java.util.List;

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

        // Step 2: Stream + map + reduce
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}
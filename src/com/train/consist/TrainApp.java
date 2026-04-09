package com.train.consist;

import java.util.LinkedHashSet;

public class TrainApp {

    public static void main(String[] args) {

        // UC5: LinkedHashSet (Order + Uniqueness)
        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainConsist = new LinkedHashSet<>();

        // Step 1: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 2: Attempt duplicate
        trainConsist.add("Sleeper"); // Duplicate

        // Step 3: Display final formation
        System.out.println("\nFinal Train Formation:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
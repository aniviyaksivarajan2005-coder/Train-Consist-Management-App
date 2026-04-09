package com.train.consist;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Step 3: Add Bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper Coach");
        trainConsist.add("General Coach");
        trainConsist.add("AC Coach");

        // Step 4: Display Updated Count
        System.out.println("\nBogies added successfully.");
        System.out.println("Total bogie count: " + trainConsist.size());

        // Step 5: Display Train Consist
        System.out.println("\nCurrent Train Composition:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
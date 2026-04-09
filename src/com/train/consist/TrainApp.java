package com.train.consist;

import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // UC1: Initialization
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainConsist = new HashSet<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC3: Add Bogies (with duplicates)
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");
        trainConsist.add("B2"); // Duplicate
        trainConsist.add("B1"); // Duplicate

        System.out.println("\nBogies added (duplicates ignored).");

        // Display count
        System.out.println("Total unique bogie count: " + trainConsist.size());

        // Display unique bogies
        System.out.println("\nUnique Train Composition:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
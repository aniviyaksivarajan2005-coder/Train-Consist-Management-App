package com.train.consist;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // UC1: Initialization
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC2: Add Bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper Coach");
        trainConsist.add("General Coach");
        trainConsist.add("AC Coach");

        System.out.println("\nBogies added successfully.");
        System.out.println("Total bogie count: " + trainConsist.size());

        // Display Train
        System.out.println("\nCurrent Train Composition:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
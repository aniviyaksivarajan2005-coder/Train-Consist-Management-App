package com.train.consist;

import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        // UC4: LinkedList for ordered train consist
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 1: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Composition:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // Step 2: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // Step 3: Remove first and last bogies
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 4: Display final train
        System.out.println("\nFinal Train Composition:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}
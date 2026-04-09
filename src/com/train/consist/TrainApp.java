package com.train.consist;

public class TrainApp {

    // Custom Exception
    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie Class
    static class PassengerBogie {
        String name;
        int capacity;

        // Constructor with validation
        PassengerBogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than 0!");
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created bogie: " + b1.name);

            // ❌ Invalid bogie
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created bogie: " + b2.name);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
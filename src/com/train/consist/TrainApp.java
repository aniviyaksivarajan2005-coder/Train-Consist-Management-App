package com.train.consist;

import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    // Inner class for Goods Bogie
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create goods bogie list
        List<GoodsBogie> bogieList = new ArrayList<>();

        bogieList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogieList.add(new GoodsBogie("Box", "Coal"));
        bogieList.add(new GoodsBogie("Flatbed", "Steel"));

        // ❗ Try invalid case:
        // bogieList.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Validate safety rules using stream
        boolean isSafe = bogieList.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}
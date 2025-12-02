package Aoc2025;

import Aoc2023.globalFuncs;

public class day2 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day2.txt");
            String[] database = in.split(",");
            int firstId = 0;
            int secondId = 0;

            for (String id : database) {
                firstId = Integer.parseInt(id.split("-")[0]);
                secondId = Integer.parseInt(id.split("-")[1]);


            }

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}
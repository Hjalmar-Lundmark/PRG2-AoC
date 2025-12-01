package Aoc2025;

import Aoc2023.globalFuncs;

public class day1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            int result = 0;
            int currentNr = 50;
            String in = globalFuncs.readFile("input/Aoc2025/day1.txt");
            System.out.println(in);




            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

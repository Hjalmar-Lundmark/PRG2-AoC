package Aoc2025;

import java.util.Arrays;

public class day3 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day3.txt");
            String[] banks = in.split("\n");

            System.out.println(Arrays.toString(banks));
            for (String bank : banks) {
                for (int i = 0; i < bank.length()-1; i++) {
                    
                }
            }


            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}


package Aoc2025;

import Aoc2023.globalFuncs;

public class day1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            int result = 0;
            int currentNr = 50;
            String in = globalFuncs.readFile("input/Aoc2025/day1.txt");
            String[] instructions = in.split("\n");

            for (String row : instructions) {
                if (row.charAt(0) == 'R') {
                    currentNr += Integer.parseInt(row.split("R")[1]);
                    while (currentNr > 99) {
                        currentNr -= 100;
                        result++;
                    }
                } else {
                    currentNr -= Integer.parseInt(row.split("L")[1]);
                    while (currentNr < 0) {
                        currentNr += 100;
                        result++;
                    }
                }

                if (currentNr == 0) {
                    result++;
                }
            }


            System.out.println(result);

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

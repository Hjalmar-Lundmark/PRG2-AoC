package Aoc2025;

import Aoc2023.globalFuncs;

import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day2.txt").split("\n")[0];
            String[] database = in.split(",");
            int firstId = 0;
            int secondId = 0;
            int result = 0;
            System.out.println(Arrays.toString(database));

            for (String id : database) {
                firstId = Integer.parseInt(id.split("-")[0]);
                secondId = Integer.parseInt(id.split("-")[1]);

                for (int i = 0; i < secondId-firstId; i++) {
                    if (isRepeating(firstId+i)) {
                        result += firstId+i;
                    }

                }
            }

            System.out.println(result);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }

    public static boolean isRepeating(int e) {
        return false;
    }
}
package Aoc2025;

import Aoc2023.globalFuncs;

import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day2.txt").split("\n")[0];
            String[] database = in.split(",");
            long firstId = 0;
            long secondId = 0;
            long result = 0;

            for (String id : database) {
                firstId = Long.parseLong(id.split("-")[0]);
                secondId = Long.parseLong(id.split("-")[1]);

                for (int i = 0; i < secondId-firstId+1; i++) {
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

    public static boolean isRepeating(long e) {
        String s = e + "";
        if (s.length() > 1) {
            // checks if first half is equal to second half, part1
            if (s.length() % 2 == 0) {
                long firstHalf = Long.parseLong(s.substring(0, s.length() / 2));
                long secondHalf = Long.parseLong(s.substring(s.length() / 2));
                if (firstHalf == secondHalf) {
                    return true;
                }
            }

            // checks if every number is the same, part2
            int temp = Integer.parseInt(String.valueOf(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                if (temp != Integer.parseInt(String.valueOf(s.charAt(i)))) {
                    break;
                }

                if (i == s.length()-1) {
                    return true;
                }
            }

            // finds repeating consecutive number
            int newTemp = temp;
            for (int i = 1; i < s.length(); i++) {
                if (temp+i == Integer.parseInt(String.valueOf(s.charAt(i)))) { // temp broken?
                    newTemp = Integer.parseInt(newTemp + "" + (temp+i));
                    System.out.println(newTemp);
                } else {
                    break;
                }
            }

        }


        return false;
    }
}
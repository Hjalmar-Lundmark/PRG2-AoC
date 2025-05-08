package Aoc2024;

import Aoc2024.Point;

public class day6 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            int result = 0;
            String[] board = globalFuncs.readFile("input/Aoc2024/day6.txt").split(",");
            Point direction = new Point(0, -1);
            Point guard = new Point(0, 0);


            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

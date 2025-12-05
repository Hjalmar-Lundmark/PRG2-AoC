package Aoc2025;

import java.util.Arrays;

public class day5 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day5.txt");
            String[] idRanges = in.split("start")[0].split("\n");
            String[] ids = in.split("start\n")[1].split("\n");
            System.out.println(Arrays.toString(idRanges));
            System.out.println(Arrays.toString(ids));


            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}


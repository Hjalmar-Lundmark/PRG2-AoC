package Aoc2025;

import java.util.ArrayList;
import java.util.Arrays;

public class day5 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day5.txt");
            String[] idRanges = in.split("start")[0].split("\n");
            String[] ids = in.split("start\n")[1].split("\n");
            int result = 0;

            System.out.println(Arrays.toString(idRanges));
            System.out.println(Arrays.toString(ids));

            for (String id : ids) {
                long ID = Long.parseLong(id);
                for (String idRange : idRanges) {
                    if (ID >= Long.parseLong(idRange.split("-")[0]) && ID <= Long.parseLong(idRange.split("-")[1])) {
                        System.out.println(ID + " is fresh");
                        result++;
                        break;
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
}


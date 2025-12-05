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
            ArrayList<Integer> validIds = new ArrayList<>();


            System.out.println(Arrays.toString(idRanges));
            System.out.println(Arrays.toString(ids));

            for (String range : idRanges) {
                int startNr = Integer.parseInt(range.split("-")[0]);
                int endNr = Integer.parseInt(range.split("-")[1]);

                for (int i = startNr; i < endNr+1; i++) {
                    if (!validIds.contains(i)) {
                        validIds.add(i);
                    }
                }
            }

            System.out.println(validIds);


            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}


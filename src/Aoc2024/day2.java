package Aoc2024;

import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        String[] reports;
        String[] level;
        String content = "";
        int safeReports = 0;

        content = globalFuncs.readFile("input/Aoc2024/day2.txt");
        reports = content.split(",");

        for (String report : reports) {
            level = report.split(" ");

            boolean safe = false;
            boolean asc = false;
            boolean firstTimeOffence = false;
            for (int j = 0; j < level.length - 1; j++) {
                int difference = Integer.parseInt(level[j]) - Integer.parseInt(level[j + 1]);

                if (j == 0) {
                    asc = difference > 0;
                }

                if (Math.abs(difference) <= 3 && difference != 0 && asc == difference > 0) {
                    safe = true;
                } else {
                    if (!firstTimeOffence) {
                        firstTimeOffence = true;
                        level = globalFuncs.removeItem(level, j+1);
                        j = -1;
                    } else {
                        safe = false;
                        break;
                    }
                }
            }

            if (safe) {
                safeReports++;
            }
        }

        System.out.println(safeReports);
    }
}

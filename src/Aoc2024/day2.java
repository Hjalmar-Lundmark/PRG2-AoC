package Aoc2024;

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
            for (int j = 0; j < level.length - 1; j++) {
                int difference = Integer.parseInt(level[j]) - Integer.parseInt(level[j + 1]);

                if (j == 0) {
                    if (difference > 0) {
                        asc = true;
                    } else {
                        asc = false;
                    }
                }

                if (Math.abs(difference) <= 3 && difference != 0 && asc == difference > 0) {
                    safe = true;
                } else {
                    safe = false;
                    break;
                }
            }

            if (safe) {
                safeReports++;
            }
        }

        System.out.println(safeReports);
    }
}

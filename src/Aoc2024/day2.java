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
            for (int j = 0; j < level.length - 1; j++) {
                if (Integer.parseInt(level[j]) >= (Integer.parseInt(level[j + 1]) + 3) || Integer.parseInt(level[j]) <= (Integer.parseInt(level[j + 1]) - 3) || Integer.parseInt(level[j]) == Integer.parseInt(level[j+1])) {
                    safe = true;
                    // fix if above

                    // add if for rising / lowering
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

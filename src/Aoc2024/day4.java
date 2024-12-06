package Aoc2024;

public class day4 {
    public static void main(String[] args) {
        int times = 0;
        String[] rows;
        String content = "";

        content = globalFuncs.readFile("input/Aoc2024/day3.txt");

        rows = content.split(",");

        for (int i = 0; i < rows.length; i++) {
            if (rows[i].charAt(i) == 'X' && rows[i].charAt(i+1) == 'M' && rows[i].charAt(i+2) == 'A' && rows[i].charAt(i+3) == 'S') {
                times++;
            } else if (rows[i].charAt(i) == 'S' && rows[i].charAt(i+1) == 'A' && rows[i].charAt(i+2) == 'M' && rows[i].charAt(i+3) == 'X') {
                times++;
            }
        }
    }
}

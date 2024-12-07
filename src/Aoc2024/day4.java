package Aoc2024;

public class day4 {
    public static void main(String[] args) {
        int times = 0;
        String[] rows;
        String content = "";

        content = globalFuncs.readFile("input/Aoc2024/day4.txt");

        rows = content.split(",");

        // Glöm inte att kolla kanter / Edgecases.
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                // Vanlig
                if (j <= rows[i].length() - 3 && rows[i].charAt(j) == 'X' && rows[i].charAt(j + 1) == 'M' && rows[i].charAt(j + 2) == 'A' && rows[i].charAt(j + 3) == 'S') {
                    times++;
                    // Bakvänt
                } else if (j <= rows[i].length() - 3 && rows[i].charAt(j) == 'S' && rows[i].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'M' && rows[i].charAt(j + 3) == 'X') {
                    times++;
                    // Vertikalt
                } else if (i <= rows.length - 3 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j) == 'M' && rows[i + 2].charAt(j) == 'A' && rows[i+3].charAt(j) == 'S') {
                    times++;
                    // Vertikalt bakvänt
                } else if (i <= rows.length - 3 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j) == 'A' && rows[i + 2].charAt(j) == 'M' && rows[i+3].charAt(j) == 'X') {
                    times++;
                    // Diagonalt höger
                } else if (j <= rows[i].length() - 3 && i <= rows.length - 3 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j + 1) == 'M' && rows[i + 2].charAt(j + 2) == 'A' && rows[i + 3].charAt(j + 3) == 'S') {
                    times++;
                    // Diagonalt höger bakvänt
                } else if (j <= rows[i].length() - 3 && i <= rows.length - 3 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j + 1) == 'A' && rows[i + 2].charAt(j + 2) == 'M' && rows[i + 3].charAt(j + 3) == 'X') {
                    times++;
                    // Diagonalt vänster
                } else if (j > 3 && i > 3 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j - 1) == 'M' && rows[i + 2].charAt(j - 2) == 'A' && rows[i - 3].charAt(j + 3) == 'S') {
                    times++;
                    // Diagonalt vänster bakvänt
                } else if (j > 3 && i > 3 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j - 1) == 'A' && rows[i + 2].charAt(j - 2) == 'M' && rows[i - 3].charAt(j + 3) == 'X') {
                    times++;
                }
            }
        }

        System.out.println(times);
    }
}

package Aoc2024;

public class day4 {
    public static void main(String[] args) {
        int times = 0;
        String[] rows;
        String content = "";

        content = globalFuncs.readFile("input/Aoc2024/day3.txt");

        rows = content.split(",");

        // Glöm inte att kolla kanter / Edgecases.
        for (int i = 0; i < rows.length; i++) {
            // Vanlig
            if (rows[i].charAt(i) == 'X' && rows[i].charAt(i+1) == 'M' && rows[i].charAt(i+2) == 'A' && rows[i].charAt(i+3) == 'S') {
                times++;
                // Bakvänt
            } else if (rows[i].charAt(i) == 'S' && rows[i].charAt(i+1) == 'A' && rows[i].charAt(i+2) == 'M' && rows[i].charAt(i+3) == 'X') {
                times++;
                // Vertikalt
            } else if (rows[i].charAt(i) == 'X' && rows[i+1].charAt(i) == 'M' && rows[i+2].charAt(i) == 'A' && rows[i].charAt(i+3) == 'S') {
                times++;
                // Vertikalt bakvänt
            } else if (rows[i].charAt(i) == 'S' && rows[i+1].charAt(i) == 'A' && rows[i+2].charAt(i) == 'M' && rows[i].charAt(i+3) == 'X') {
                times++;
                // Diagonalt höger
            } else if (rows[i].charAt(i) == 'X' && rows[i+1].charAt(i+1) == 'M' && rows[i+2].charAt(i+2) == 'A' && rows[i+3].charAt(i+3) == 'S') {
                times++;
                // Diagonalt höger bakvänt
            } else if (rows[i].charAt(i) == 'S' && rows[i+1].charAt(i+1) == 'A' && rows[i+2].charAt(i+2) == 'M' && rows[i+3].charAt(i+3) == 'X') {
                times++;
                // Diagonalt vänster
            } else if (rows[i].charAt(i) == 'X' && rows[i+1].charAt(i-1) == 'M' && rows[i+2].charAt(i-2) == 'A' && rows[i-3].charAt(i+3) == 'S') {
                times++;
                // Diagonalt vänster bakvänt
            } else if (rows[i].charAt(i) == 'S' && rows[i+1].charAt(i-1) == 'A' && rows[i+2].charAt(i-2) == 'M' && rows[i-3].charAt(i+3) == 'X') {
                times++;
            }
        }

        System.out.println(times);
    }
}

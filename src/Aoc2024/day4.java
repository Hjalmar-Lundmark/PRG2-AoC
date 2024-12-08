package Aoc2024;

import java.util.Arrays;

public class day4 {
    public static void main(String[] args) {
        int times = 0;
        String[] rows;
        String[] testing;
        String content = "";
        boolean part2 = true;

        content = globalFuncs.readFile("input/Aoc2024/day4.txt");

        rows = content.split(",");
        testing = content.split(",");

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                    testing[i] = testing[i].substring(0, j) + '.' + testing[i].substring(j + 1);
            }
        }

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                if (!part2) {
                    // Vanlig
                    if (j <= rows[i].length() - 4 && rows[i].charAt(j) == 'X' && rows[i].charAt(j + 1) == 'M' && rows[i].charAt(j + 2) == 'A' && rows[i].charAt(j + 3) == 'S') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i] = testing[i].substring(0, j + 1) + rows[i].charAt(j + 1) + testing[i].substring(j + 1 + 1);
                        testing[i] = testing[i].substring(0, j + 2) + rows[i].charAt(j + 2) + testing[i].substring(j + 2 + 1);
                        testing[i] = testing[i].substring(0, j + 3) + rows[i].charAt(j + 3) + testing[i].substring(j + 3 + 1);
                        times++;
                    }
                    // Bakvänt
                    if (j <= rows[i].length() - 4 && rows[i].charAt(j) == 'S' && rows[i].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'M' && rows[i].charAt(j + 3) == 'X') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i] = testing[i].substring(0, j + 1) + rows[i].charAt(j + 1) + testing[i].substring(j + 1 + 1);
                        testing[i] = testing[i].substring(0, j + 2) + rows[i].charAt(j + 2) + testing[i].substring(j + 2 + 1);
                        testing[i] = testing[i].substring(0, j + 3) + rows[i].charAt(j + 3) + testing[i].substring(j + 3 + 1);
                        times++;
                    }
                    // Vertikalt
                    if (i <= rows.length - 4 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j) == 'M' && rows[i + 2].charAt(j) == 'A' && rows[i + 3].charAt(j) == 'S') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j) + rows[i + 1].charAt(j) + testing[i + 1].substring(j + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j) + rows[i + 2].charAt(j) + testing[i + 2].substring(j + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j) + rows[i + 3].charAt(j) + testing[i + 3].substring(j + 1);
                        times++;
                    }
                    // Vertikalt bakvänt
                    if (i <= rows.length - 4 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j) == 'A' && rows[i + 2].charAt(j) == 'M' && rows[i + 3].charAt(j) == 'X') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j) + rows[i + 1].charAt(j) + testing[i + 1].substring(j + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j) + rows[i + 2].charAt(j) + testing[i + 2].substring(j + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j) + rows[i + 3].charAt(j) + testing[i + 3].substring(j + 1);
                        times++;
                    }
                    // Diagonalt höger
                    if (j <= rows[i].length() - 4 && i < rows.length - 3 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j + 1) == 'M' && rows[i + 2].charAt(j + 2) == 'A' && rows[i + 3].charAt(j + 3) == 'S') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j + 1) + rows[i + 1].charAt(j + 1) + testing[i + 1].substring(j + 1 + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j + 2) + rows[i + 2].charAt(j + 2) + testing[i + 2].substring(j + 2 + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j + 3) + rows[i + 3].charAt(j + 3) + testing[i + 3].substring(j + 3 + 1);
                        times++;
                    }
                    // Diagonalt höger bakvänt
                    if (j <= rows[i].length() - 4 && i < rows.length - 3 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j + 1) == 'A' && rows[i + 2].charAt(j + 2) == 'M' && rows[i + 3].charAt(j + 3) == 'X') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j + 1) + rows[i + 1].charAt(j + 1) + testing[i + 1].substring(j + 1 + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j + 2) + rows[i + 2].charAt(j + 2) + testing[i + 2].substring(j + 2 + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j + 3) + rows[i + 3].charAt(j + 3) + testing[i + 3].substring(j + 3 + 1);
                        times++;
                    }
                    // Diagonalt vänster
                    if (j >= 3 && i < rows.length - 3 && rows[i].charAt(j) == 'X' && rows[i + 1].charAt(j - 1) == 'M' && rows[i + 2].charAt(j - 2) == 'A' && rows[i + 3].charAt(j - 3) == 'S') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j - 1) + rows[i + 1].charAt(j - 1) + testing[i + 1].substring(j - 1 + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j - 2) + rows[i + 2].charAt(j - 2) + testing[i + 2].substring(j - 2 + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j - 3) + rows[i + 3].charAt(j - 3) + testing[i + 3].substring(j - 3 + 1);
                        times++;
                    }
                    // Diagonalt vänster bakvänt
                    if (j >= 3 && i < rows.length - 3 && rows[i].charAt(j) == 'S' && rows[i + 1].charAt(j - 1) == 'A' && rows[i + 2].charAt(j - 2) == 'M' && rows[i + 3].charAt(j - 3) == 'X') {
                        testing[i] = testing[i].substring(0, j) + rows[i].charAt(j) + testing[i].substring(j + 1);
                        testing[i + 1] = testing[i + 1].substring(0, j - 1) + rows[i + 1].charAt(j - 1) + testing[i + 1].substring(j - 1 + 1);
                        testing[i + 2] = testing[i + 2].substring(0, j - 2) + rows[i + 2].charAt(j - 2) + testing[i + 2].substring(j - 2 + 1);
                        testing[i + 3] = testing[i + 3].substring(0, j - 3) + rows[i + 3].charAt(j - 3) + testing[i + 3].substring(j - 3 + 1);
                        times++;
                    }
                } else {
                    if (j <= rows[i].length() - 3 && i < rows.length - 2 && rows[i].charAt(j) == 'M' && rows[i+1].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'M' && rows[i+2].charAt(j) == 'S' && rows[i+2].charAt(j+2) == 'S') {
                        times++;
                    } else if (j <= rows[i].length() - 3 && i < rows.length - 2 && rows[i].charAt(j) == 'M' && rows[i+1].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'S' && rows[i+2].charAt(j) == 'M' && rows[i+2].charAt(j+2) == 'S') {
                        times++;
                    } else if (j <= rows[i].length() - 3 && i < rows.length - 2 && rows[i].charAt(j) == 'S' && rows[i+1].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'S' && rows[i+2].charAt(j) == 'M' && rows[i+2].charAt(j+2) == 'M') {
                        times++;
                    } else if (j <= rows[i].length() - 3 && i < rows.length - 2 && rows[i].charAt(j) == 'S' && rows[i+1].charAt(j + 1) == 'A' && rows[i].charAt(j + 2) == 'M' && rows[i+2].charAt(j) == 'S' && rows[i+2].charAt(j+2) == 'M') {
                        times++;
                    }
                }
            }
        }

        System.out.println(times);

        if (!part2) {
            for (String test : testing) {
                System.out.println(test);
            }
        }
    }
}

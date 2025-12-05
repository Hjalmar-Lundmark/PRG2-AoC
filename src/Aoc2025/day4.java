package Aoc2025;

import java.util.Arrays;

public class day4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day4.txt");
            String[] rows = in.split("\n");
            String[] copy = in.split("\n");
            int result = 0;
            int removedThisTurn;

            while (true) {
                removedThisTurn = 0;
                for (int i = 0; i < rows.length; i++) {
                    for (int j = 0; j < rows[i].length(); j++) {
                        if (rows[i].charAt(j) == '@') {
                            if (countNeighbors(j, i, rows) < 4) {
                                result++;
                                removedThisTurn++;
                                copy[i] = copy[i].substring(0, j) + '.' + copy[i].substring(j + 1);
                            }
                        }
                    }
                }
                rows = copy;

                if (removedThisTurn == 0) {
                    break;
                }
            }


            System.out.println(result);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }

    public static int countNeighbors(int x, int y, String[] rows) {
        int neighbors = 0;
        int width = rows[y].length();
        int height = rows.length;

        if (x+1 < width) {
            if (rows[y].charAt(x+1) == '@') {
                neighbors++;
            }
        }
        if (x-1 >= 0) {
            if (rows[y].charAt(x-1) == '@') {
                neighbors++;
            }
        }

        if (y+1 < height) {
            if (rows[y+1].charAt(x) == '@') {
                neighbors++;
            }
        }
        if (y-1 >= 0) {
            if (rows[y-1].charAt(x) == '@') {
                neighbors++;
            }
        }

        if (x+1 < width && y+1 < height) {
            if (rows[y+1].charAt(x+1) == '@') {
                neighbors++;
            }
        }
        if (x-1 >= 0 && y-1 >= 0) {
            if (rows[y-1].charAt(x-1) == '@') {
                neighbors++;
            }
        }

        if (x+1 < width && y-1 >= 0) {
            if (rows[y-1].charAt(x+1) == '@') {
                neighbors++;
            }
        }
        if (x-1 >= 0 && y+1 < height) {
            if (rows[y+1].charAt(x-1) == '@') {
                neighbors++;
            }
        }

        return neighbors;
    }
}

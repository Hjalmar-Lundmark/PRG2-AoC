package Aoc2025;

public class day4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day4.txt");
            String[] rows = in.split("\n");
            int result = 0;

            for (int i = 0; i < rows.length; i++) {
                for (int j = 0; j < rows[i].length(); j++) {
                    if (countNeighbors(j, i, rows[i].length(), rows.length, rows[i].charAt(j)) < 5) {
                        result++;
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

    public static int countNeighbors(int x, int y, int width, int height, char content) {
        int neighbors = 0;

        if (x+1 < width) {
            if (content == '@') {
                neighbors++;
            }
        }
        if (x-1 >= 0) {
            if (content == '@') {
                neighbors++;
            }
        }

        if (y+1 < height) {
            if (content == '@') {
                neighbors++;
            }
        }
        if (y-1 >= 0) {
            if (content == '@') {
                neighbors++;
            }
        }

        return neighbors;
    }
}

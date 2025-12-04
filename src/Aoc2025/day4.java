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

                }
            }


            System.out.println(result);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

package Aoc2024;

import java.util.ArrayList;

public class day8 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String[] board = globalFuncs.readFile("input/Aoc2024/day8.txt").split(",");
            ArrayList<Point> nodes = new ArrayList<Point>();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length(); j++) {
                    if (board[i].charAt(j) != '.') {
                        Point currentNode = new Point(i, j, 0, 0);
                        currentNode.setIdentifier(board[i].charAt(j));
                        nodes.add(currentNode);
                    }
                }
            }

            System.out.println(nodes);

            for (int i = 0; i < nodes.size(); i++) {

            }

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

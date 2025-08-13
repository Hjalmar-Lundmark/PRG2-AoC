package Aoc2024;

import java.util.ArrayList;

public class day8 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String[] board = globalFuncs.readFile("input/Aoc2024/day8.txt").split(",");
            ArrayList<Point> nodes = new ArrayList<Point>();
            int distanceBetweenX;
            int distanceBetweenY;

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
                for (int j = 0; j < nodes.size(); j++) {
                    if (i != j && nodes.get(i).getIdentifier() == nodes.get(j).getIdentifier()) {
                        distanceBetweenX = Math.abs(nodes.get(i).getX() - nodes.get(j).getX());
                        distanceBetweenY = Math.abs(nodes.get(i).getY() - nodes.get(j).getY());


                    }
                }
            }

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

package Aoc2024;

import java.util.ArrayList;

public class day8 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String[] board = globalFuncs.readFile("input/Aoc2024/day8.txt").split(",");
            ArrayList<Point> nodes = new ArrayList<Point>();
            ArrayList<Point> antinodes = new ArrayList<Point>();
            int distanceBetweenX;
            int distanceBetweenY;
            int result = 0;

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

                        if (nodes.get(i).getX() + distanceBetweenX == nodes.get(j).getX() &&
                                nodes.get(i).getY() + distanceBetweenY == nodes.get(j).getY()) {
                            antinodes.add(new Point(nodes.get(i).getX() - distanceBetweenX, nodes.get(i).getY() - distanceBetweenY, 0, 0));
                            antinodes.add(new Point(nodes.get(j).getX() + distanceBetweenX, nodes.get(j).getY() + distanceBetweenY, 0, 0));
                        } else if (false) {

                        }

                    }
                }
            }

            //TODO also check for 2 in 1 place
            antinodes.removeIf(node -> node.getY() < 0 || node.getY() > board.length - 1 || node.getX() < 0 || node.getX() > board[0].length() - 1);

            for (int i = 0; i < board.length; i++) {
                for (Point node : antinodes) {
                    if (node.getY() == i) {
                        String newRow = "";
                        for (int j = 0; j < board[i].length(); j++) {
                            if (node.getX() == j) {
                                newRow = newRow + '#';
                            } else {
                                newRow = newRow + board[i].charAt(j);
                            }
                        }
                        board[i] = newRow;
                    }
                }
            }

            for (String row: board) {
                System.out.println(row);
            }

            System.out.println("There are " + result + " unique locations withing the map");

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

package Aoc2024;

import Aoc2024.Point;

import java.util.ArrayList;
import java.util.Arrays;

public class day6 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            int result = 0;
            String[] board = globalFuncs.readFile("input/Aoc2024/day6.txt").split(",");
            Point guard = new Point(0, 0, 0, 0);
            ArrayList<Point> visitedCoords = new ArrayList<>();
            Point nextCoord;
            boolean neverVisited;

            for (int i = 0; i < board.length; i++) {
                if (board[i].indexOf('^') != -1) {
                    guard = new Point(board[i].indexOf('^'), i, 0, -1);
                    break;
                }
            }

            visitedCoords.add(new Point(guard.getX(), guard.getY(), 0, 0));

            while (true) {
                nextCoord = guard.getNextCoord();
                if (nextCoord.getX() < 0 || nextCoord.getY() < 0 || nextCoord.getX() > board[0].length() || nextCoord.getY() > board.length) {
                    System.out.println("Guard has left the area at coords " + guard.getX() + "," + guard.getY());
                    System.out.println(nextCoord.getX() + "," + nextCoord.getY());
                    break;
                } else if (board[nextCoord.getY()].charAt(nextCoord.getX()) == '#') {
                    guard.changeDirection();
                } else {
                    guard.move();

                    neverVisited = true;
                    for (Point p : visitedCoords) {
                        if (p.getX() == guard.getX() && p.getY() == guard.getY()) {
                            neverVisited = false;
                            break;
                        }
                    }
                    if (neverVisited) {
                        visitedCoords.add(new Point(guard.getX(), guard.getY(), 0, 0));
                    }
                }
            }

            System.out.println("Guard visited " + visitedCoords.size() + " coordinates");

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

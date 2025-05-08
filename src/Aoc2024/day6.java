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
            Point direction = new Point(0, -1);
            Point guard;
            ArrayList<Point> visitedCoords = new ArrayList<>();
            Point nextCoord;

            for (int i = 0; i < board.length; i++) {
                if (board[i].indexOf('^') != -1) {
                    guard = new Point(board[i].indexOf('^'), i);
                    break;
                }
            }

            while (true) {
                nextCoord = guard.getNextCoord(direction);
                if (nextCoord.getX() < 0 || ) {
                    break;
                } else if (board[nextCoord.getY()].charAt(nextCoord.getX()) == '#') {
                    direction.changeDirection();
                } else {
                    guard.move(direction);
                    visitedCoords.add(new Point(guard.getX(), guard.getY()));
                }

                break;
            }

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

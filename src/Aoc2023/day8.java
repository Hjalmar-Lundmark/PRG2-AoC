package Aoc2023;

import java.util.ArrayList;
import java.util.Objects;

public class day8 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2023/day8.txt");
            String orders = in.split("\n")[0];
            String[] positions = in.split("start\n")[1].split("\n");
            int steps = 0;
            ArrayList<Node> nodes = new ArrayList<Node>();
            //Node currentPosition = new Node("","","");
            ArrayList<Node> currentPositions = new ArrayList<>();
            int startingPositions = 0;
            boolean part2 = true;

            for (String p : positions) {
                nodes.add(new Node(p.split(" =")[0], p.split("\\(")[1].split(",")[0], p.split(", ")[1].split("\\)")[0]));
            }


            if (part2) {
                for (Node n : nodes) {
                    if (n.getPosition().endsWith("A")) {
                        startingPositions++;
                        currentPositions.add(n);
                    }
                }
            } else {
                for (Node n : nodes) {
                    if (Objects.equals(n.getPosition(), "AAA")) {
                        currentPositions.add(n);
                    }
                }
            }

            for (int i = 0; true; i++) {
                for (int j = 0; j < currentPositions.size(); j++) {
                    if (i > orders.length() - 1) {
                        i -= orders.length();
                    }

                    if (orders.charAt(i) == 'L') {
                        currentPositions.set(j, findNode(nodes, currentPositions.get(j).getLeft()));
                    } else {
                        currentPositions.set(j, findNode(nodes, currentPositions.get(j).getRight()));
                    }

                    if (part2) {
                        if (currentPositions.get(j).getPosition().endsWith("Z")) {
                            currentPositions.remove(j);
                        }
                    } else {
                        if (currentPositions.get(j).getPosition().endsWith("ZZZ")) {
                            currentPositions.remove(j);
                        }
                    }
                }
                steps++;

                if (currentPositions.isEmpty()) {
                    break;
                }
            }

            System.out.println(steps + " steps to reach the target");

            System.out.println(startingPositions);

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }

    public static Node findNode(ArrayList<Node> nodes, String newNode) {
        for (Node n : nodes) {
            if (Objects.equals(n.getPosition(), newNode)) {
                return n;
            }
        }
        throw new NullPointerException("Couldn't find next position");
    }
}

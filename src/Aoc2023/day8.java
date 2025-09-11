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
            Node currentPosition = new Node("","","");

            for (String p : positions) {
                nodes.add(new Node(p.split(" =")[0], p.split("\\(")[1].split(",")[0], p.split(", ")[1].split("\\)")[0]));
            }
            System.out.println(nodes.get(0).toString());
            System.out.println(nodes.size());

            for (Node n : nodes) {
                if (Objects.equals(n.getPosition(), "AAA")) {
                    currentPosition = n;
                }
            }

            for (int i = 0; true; i++) {
                if (i > orders.length()-1) {
                    i -= orders.length();
                }

                switch (orders.charAt(i)) {
                    case 'L': {
                        currentPosition = findNode(nodes, currentPosition.getLeft());
                    }
                    case 'R': {
                        currentPosition = findNode(nodes, currentPosition.getRight());
                    }
                }

                steps++;
                System.out.println(currentPosition.getPosition());
                if (Objects.equals(currentPosition.getPosition(), "ZZZ")) {
                    break;
                }
            }

            System.out.println(steps + " steps to reach ZZZ");

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

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
            Node start = new Node("","","");

            for (String p : positions) {
                nodes.add(new Node(p.split(" = ")[0], p.split("\\(")[1].split(",")[0], p.split(",")[1].split("\\)")[0]));
            }
            System.out.println(nodes.get(0).toString());

            for (Node n : nodes) {
                if (Objects.equals(n.getPosition(), "AAA")) {
                    start = n;
                }
            }

            System.out.println(start.toString());

            while (true) {


                steps++;
                if (true) {
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
}

package Aoc2023;

public class Node {
    private String position;
    private String left;
    private String right;

    public Node(String position, String left, String right) {
        this.position = position;
        this.left = left;
        this.right = right;
    }

    public String getPosition() {
        return position;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "position='" + position + '\'' +
                ", left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}

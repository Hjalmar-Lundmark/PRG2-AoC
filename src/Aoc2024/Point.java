package Aoc2024;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changeDirection(String way) {
        switch (way) {
            case "UP" -> {
                this.y = -1;
                this.x = 0;
            }
            case "RIGHT" -> {
                this.y = 0;
                this.x = 1;
            }
            case "DOWN" -> {
                this.y = 1;
                this.x = 0;
            }
            case "LEFT" -> {
                this.y = 0;
                this.x = -1;
            }
        }
    }
}

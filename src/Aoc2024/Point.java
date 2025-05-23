package Aoc2024;

public class Point {
    private int x;
    private int y;
    private int vx;
    private int vy;

    public Point(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        this.x += this.vx;
        this.y += this.vy;
    }

    public void changeDirection() {
        if (this.vx == -1 && this.vy == 0) { // if left, go up
            this.vx = 0;
            this.vy = -1;
        } else if (this.vx == 0 && this.vy == -1) {
            this.vx = 1;
            this.vy = 0;
        } else if (this.vx == 1 && this.vy == 0) {
            this.vx = 0;
            this.vy = 1;
        } else if (this.vx == 0 && this.vy == 1) {
            this.vx = -1;
            this.vy = 0;
        }
    }

    public Point getNextCoord() {
        return new Point(this.x + this.vx, this.y + this.vy, 0, 0);
    }
}

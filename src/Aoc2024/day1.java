package Aoc2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        String content = "";
        String[] row;
        int distance = 0;

        content = globalFuncs.readFile("input/Aoc2024/day1.txt");

        row = content.split(",");
        for (int i = 0; i < row.length; i++) {
            String[] sides = row[i].split("   ");
            for (int j = 0; j < sides.length; j++) {
                int number = Integer.parseInt(sides[j]);
                if (j % 2 == 0) {
                    left.add(number);
                } else {
                    right.add(number);
                }
            }
        }

        Collections.sort(left);
        Collections.sort(right);

        for (int i = 0; i < row.length; i++) {
            distance += Math.abs((left.get(i) - right.get(i)));
        }

        System.out.println(distance);
    }
}

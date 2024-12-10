package Aoc2024;

import java.util.Arrays;

public class day9 {
    public static void main(String[] args) {
        int result = 0;
        String fullString = "";
        String reverse = "";
        char counter = '0';
        int dotCounter = 0;
        int times;
        String ch = "";
        String content = globalFuncs.readFile("input/Aoc2024/day9.txt").split(",")[0];

        for (int i = 0; i < content.length(); i++) {
            times = Integer.parseInt(String.valueOf(content.charAt(i)));

            if (i % 2 == 0) {
                for (int j = 0; j < times; j++) {
                    fullString += counter;
                }
            } else {
                for (int j = 0; j < times; j++) {
                    fullString += ".";
                    dotCounter++;
                }
                counter++;
                //System.out.println(counter);
            }
        }

        reverse = globalFuncs.reverse(fullString);

        for (int i = 0; i < fullString.length(); i++) {
            if (fullString.charAt(i) == '.' && dotCounter >= 0) {
                for (int j = 0; j < reverse.length(); j++) {
                    if (reverse.charAt(j) != '.') {
                        ch = String.valueOf(fullString.charAt(i));

                        reverse = reverse.substring(0, j) + "." + fullString.substring(j + 1);
                        reverse = reverse.substring(0, i) + ch + fullString.substring(i + 1);

                        fullString = fullString.substring(0, i) + ch + fullString.substring(i + 1);
                        fullString = fullString.substring(0, j) + "." + fullString.substring(j + 1);

                        break;
                    }
                }
                dotCounter--;

                //fullString = fullString.substring(0, i) +  + fullString.substring(i + 1);
            }
        }

        //System.out.println(Integer.valueOf(counter-48));
        System.out.println(fullString);
    }
}

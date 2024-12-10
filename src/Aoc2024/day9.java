package Aoc2024;

import java.util.Arrays;

public class day9 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            int result = 0;
            String fullString = "";
            String reverse = "";
            char counter = '0';
            int dotCounter = -2;
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
                }
            }

            reverse = globalFuncs.reverse(fullString);

            for (int i = 0; i < fullString.length(); i++) {
                if (fullString.charAt(i) == '.' && dotCounter > 0) {
                    for (int j = 0; j < reverse.length(); j++) {
                        if (reverse.charAt(j) != '.') {
                            ch = String.valueOf(reverse.charAt(j));

                            fullString = fullString.substring(0, i) + ch + fullString.substring(i + 1);
                            fullString = fullString.substring(0, reverse.length() - 1 - j) + "." + fullString.substring(reverse.length() - 1 - j + 1);
                            reverse = globalFuncs.reverse(fullString);

                            break;
                        }
                    }
                    dotCounter--;
                }
            }

            for (int i = 0; i < fullString.length(); i++) {
                if (fullString.charAt(i) == '.') {
                    break;
                }

                result += (i * (fullString.charAt(i)-48));
            }

            System.out.println(result);

            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}

package Aoc2024;

import java.util.Arrays;

public class day9 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            long result = 0;
            String fullString = "";
            String reverse = "";
            char counter = '0';
            int dotCounter = 0;
            int times;
            String ch = "";
            String content = globalFuncs.readFile("input/Aoc2024/day9.txt").split(",")[0];
            boolean stop = false;

            for (int i = 0; i < content.length(); i++) {
                times = Integer.parseInt(String.valueOf(content.charAt(i)));

                if (i % 2 == 0) {
                    for (int j = 0; j < times; j++) {
                        fullString += counter;
                    }
                } else {
                    for (int j = 0; j < times; j++) {
                        fullString += "❀";
                        dotCounter++;
                    }
                    counter++;
                }
            }
            System.out.println("checkpoint 1");
            System.out.println("Added " + dotCounter + " dots");
            int dotCounterMax = dotCounter;
            System.out.println(fullString);

            reverse = globalFuncs.reverse(fullString);

            System.out.println("checkpoint 1.5");

            for (int i = 0; i < fullString.length(); i++) {
                if (fullString.charAt(i) == '❀' && dotCounter > 0) {
                    for (int j = 0; j < reverse.length(); j++) {
                        if (reverse.charAt(j) != '❀') {
                            ch = String.valueOf(reverse.charAt(j));

                            //System.out.println(i + ", " + j);
                            if (j == dotCounterMax){
                                System.out.println("Finished");
                                stop = true;
                                break;
                            }

                            fullString = fullString.substring(0, i) + ch + fullString.substring(i + 1);
                            fullString = fullString.substring(0, reverse.length() - 1 - j) + "❀" + fullString.substring(reverse.length() - 1 - j + 1);
                            reverse = reverse.substring(0, j) + "❀" + reverse.substring(j+1);
                            reverse = reverse.substring(0, reverse.length()-1-i) + ch + reverse.substring(reverse.length()-1-i+1);

                            //System.out.println(fullString);
                            break;
                        }
                    }
                    dotCounter--;

                    if (stop) {
                        break;
                    }
                }
            }

            System.out.println(fullString);

            System.out.println("checkpoint 2");

            for (int i = 0; i < fullString.length(); i++) {
                if (fullString.charAt(i) == '❀') {
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

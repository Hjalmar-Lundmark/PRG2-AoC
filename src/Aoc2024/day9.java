package Aoc2024;

public class day9 {
    public static void main(String[] args) {
        int result = 0;
        String fullString = "";
        char counter = '0';
        int times;
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
                }
                counter++;
                //System.out.println(counter);
            }
        }

        for (int i = 0; i < fullString.length(); i++) {
            if (fullString.charAt(i) == '.') {
                //fullString = fullString.substring(0, i) +  + fullString.substring(i + 1);
            }
        }

        //System.out.println(Integer.valueOf(counter-48));
        System.out.println(fullString);
    }
}

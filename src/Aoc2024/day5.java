package Aoc2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class day5 {
    public static void main(String[] args) {
        int result = 0;
        String[] rules;
        String[] updates;
        String firstInt = "";
        String secondInt = "";

        rules = readFile("input/Aoc2024/day5.txt").split("\n.\n")[0].split(".\n");
        updates = readFile("input/Aoc2024/day5.txt").split("\n.\n")[1].split(".\n");

        System.out.println(Arrays.toString(rules));
        System.out.println(Arrays.toString(updates));

        for (String update : updates) {
            for (String rule : rules) {
                firstInt = Integer.parseInt(rule.split("\\|")[0]);
                secondInt = Integer.parseInt(rule.split("\\|")[1]);

                if (update.contains(firstInt) && update.contains(secondInt)) {
                    System.out.println("trueeee");
                    System.out.println(update);
                    break;
                }
            }
            break;
        }
    }

    public static String readFile(String filename) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filename);
            BufferedReader inFil = new BufferedReader(fr);
            m2 = inFil.readLine();
            while (m2 != null) {
                //System.out.println(meddelande);
                // read next line
                meddelande += m2 + ".\n";
                //meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }
}

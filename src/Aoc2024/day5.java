package Aoc2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class day5 {
    public static void main(String[] args) {
        int result = 0;
        String[] rules;
        String[] updates;
        ArrayList<String> correctUpdates = new ArrayList<>();
        String firstRuleHalf = "";
        String secondRuleHalf = "";
        boolean updateInRightOrder;

        rules = readFile("input/Aoc2024/day5.txt").split("\n.\n")[0].split(".\n");
        updates = readFile("input/Aoc2024/day5.txt").split("\n.\n")[1].split(".\n");

        for (String update : updates) {
            updateInRightOrder = true; //default
            for (String rule : rules) {
                firstRuleHalf = rule.split("\\|")[0];
                secondRuleHalf = rule.split("\\|")[1];

                if (update.contains(firstRuleHalf) && update.contains(secondRuleHalf)) {
                    if (update.indexOf(firstRuleHalf) < update.indexOf(secondRuleHalf)) {


                    } else {
                        updateInRightOrder = false;
                        break;
                    }
                }
            }

            if (updateInRightOrder) {
                correctUpdates.add(update);
            }
        }

        //calc middle values

        System.out.println(correctUpdates);
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

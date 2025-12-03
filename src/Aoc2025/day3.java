package Aoc2025;

import java.util.Arrays;

public class day3 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try {
            String in = globalFuncs.readFile("input/Aoc2025/day3.txt");
            String[] banks = in.split("\n");
            int result = 0;
            int firstNr;
            int secondNr;
            String secondPartOfBank = "";
            int firstNrPos;

            System.out.println(Arrays.toString(banks));
            for (String bank : banks) {
                firstNr = 0;
                firstNrPos = 0;
                secondNr = 0;
                for (int i = 0; i < bank.length() - 1; i++) {
                    if (Integer.parseInt(String.valueOf(bank.charAt(i))) > firstNr) {
                        firstNr = Integer.parseInt(String.valueOf(bank.charAt(i)));
                        firstNrPos = i;
                    }

                    if (i == bank.length()-2) {
                        secondPartOfBank = bank.substring(firstNrPos+1);
                        System.out.println(secondPartOfBank);
                    }
                }

                for (int i = 0; i < secondPartOfBank.length(); i++) {
                    if (Integer.parseInt(String.valueOf(secondPartOfBank.charAt(i))) > secondNr) {
                        secondNr = Integer.parseInt(String.valueOf(secondPartOfBank.charAt(i)));
                    }
                }

                System.out.println(result);
                result += Integer.parseInt(firstNr + "" + secondNr);
            }

            System.out.println(result);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nCode took " + (System.currentTimeMillis() - time) + " ms to run");
        }
    }
}


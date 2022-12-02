package AoC2022;

import java.io.*;
import java.util.Scanner;

public class dec2_2022 {
    public static void main(String[] args) {
        int points = 0;
        String full = "";
        String line = "";
        int start = 0;
        int pointsP2 = 0;
        //A for Rock, B for Paper, and C for Scissors
        //X for Rock, Y for Paper, and Z for Scissors
        //Points:
        //1 for Rock, 2 for Paper, and 3 for Scissors
        //0 if you lost, 3 if the round was a draw, and 6 if you won

        full = readFile("input/dec2.txt");

        while (true) {
            line = "";
            for (int i = 0; i < 3; i++) {
                line += full.charAt(start);
                start++;
            }

            if (line.contains("A")) {
                if (line.contains("X")) {
                    points += 4;        //part1
                    pointsP2 += 3;      //part2
                } else if (line.contains("Y")) {
                    points += 8;
                    pointsP2 += (1+3);
                } else {
                    points += 3;
                    pointsP2 += (2+6);
                }
            } else if (line.contains("B")) {
                if (line.contains("X")) {
                    points += 1;
                    pointsP2 += 1;
                } else if (line.contains("Y")) {
                    points += 5;
                    pointsP2 += (2+3);
                } else {
                    points += 9;
                    pointsP2 += (3+6);
                }
            } else {
                if (line.contains("X")) {
                    points += 7;
                    pointsP2 += 2;
                } else if (line.contains("Y")) {
                    points += 2;
                    pointsP2 += (3+3);
                } else {
                    points += 6;
                    pointsP2 += (1+6);
                }
            }
            if (start >= full.length()) {
                break;
            }
        }

        System.out.println(points);
        System.out.println(pointsP2);
    }

    public static String readFile(String filnamn) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            m2 = inFil.readLine();
            while (m2 != null) {
                //System.out.println(meddelande);
                // read next line
                meddelande += m2;
                //meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }

    public static String altReadFile(String filnamn) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filnamn));
        String meddelande = "";
        while (in.hasNext()) {
            meddelande += in.nextLine();
            meddelande += " ";
        }
        return meddelande;
    }
}

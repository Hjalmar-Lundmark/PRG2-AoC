package Aoc2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day15 {
    public static void main(String[] args) {
        String in = readFile("day15.txt");
        String[] lines = in.split(",");
        int total = 0;
        int hashValue = 0;

        for (int i = 0; i < lines.length; i++) {
            hashValue = 0;
            for (int j = 0; j < lines[i].length(); j++) {
                hashValue += lines[i].charAt(j);
                hashValue = calcHash(hashValue);
            }
            total += hashValue;
        }
        System.out.println(total);
    }

    public static int calcHash(int c) {
        int ascii = c;
        //System.out.println(ascii);
        ascii = ascii * 17;
        //System.out.println(ascii);
        ascii = ascii % 256;
        System.out.println(ascii);
        return ascii;
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
}
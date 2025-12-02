package Aoc2025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class globalFuncs {

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
                meddelande += m2 + '\n';
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

package AoC2021;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class dec1_2021 {
    public static void main(String[] args) {
        int depth;
        int lastDepth;
        int total = 0;
        ArrayList<String> in = new ArrayList<String>();

        try {
            in = altReadFile("input/1dec2021.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 1; i < in.toArray().length; i++) {
            if (Integer.parseInt(in.get(i-1)) < Integer.parseInt(in.get(i))) {
                total++;
            }
        }
        System.out.println(total);
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

    public static ArrayList<String> altReadFile(String filnamn) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filnamn));
        ArrayList<String> meddelande = new ArrayList<String>();;
        while (in.hasNext()) {
            meddelande.add(in.nextLine());
        }
        return meddelande;
    }
}

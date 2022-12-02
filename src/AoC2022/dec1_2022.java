package AoC2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class dec1_2022 {
    public static void main(String[] args) {
        int[] elf = new int[300];
        String in = "";
        String sting = "";
        int p = 0;
        int i = 0;

        in = readFile("input/dec1.txt");
        while (true) {
            while (true) {
                sting = "";
                if (p >= (in.length()-1)) {
                    break;
                }
                for (int q = 0; q < 6; q++) {       //Creates a full number, ie 1234
                    if (in.charAt(p) != ' ') {
                        sting += in.charAt(p);
                    }
                    p++;
                    if (in.charAt(p) == ' ') {
                        break;
                    }
                }

                if (sting != "") {          //calculates
                    elf[i] += Integer.parseInt(sting);
                } else {
                    break;
                }
            }

            i++;
            //System.out.println(p);
            //System.out.println(i);
            if (p >= (in.length()-1)) {
                break;
            }
        }

        System.out.println("Klar");
        //find biggest in elf
        OptionalInt out = Arrays.stream(elf).max();
        int outInt = out.getAsInt();
        System.out.println(outInt);

        //Part 2
        IntStream outStre = Arrays.stream(elf).sorted();
        int[] outArray = outStre.toArray();
        outInt += outArray[outArray.length-2] + outArray[outArray.length-3];
        System.out.println(outInt);
    }

    public static String readFile(String filnamn) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            //meddelande += inFil.readLine();      //vilken linje läser den? Bara första?
            m2 = inFil.readLine();
            while (m2 != null) {
                //System.out.println(meddelande);
                // read next line
                meddelande += m2;
                meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }
}

package Aoc2023;

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

    public static String[] removeItem(String[] array, int index) {
        //System.out.println("RemoveItem called");
        String[] newArray = new String[array.length -1];
        for(int i = 0, k = 0; i < array.length; i++){
            if(i != index) {
                newArray[k] = array[i];
                k++;
            }
        }
        //System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(newArray));

        return newArray;
    }

    public static String reverse(String in) {
        String reversed = "";
        for (int i = 0; i < in.length(); i++) {
            reversed = in.charAt(i) + reversed;
        }
        return reversed;
    }
}

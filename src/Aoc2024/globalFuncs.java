package Aoc2024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
                meddelande += m2 + ',';
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
        String[] newArray = new String[array.length -1];
        for(int i = 0, k = 0; i < array.length; i++){
            if(i!=index){
                newArray[k]=array[i];
                k++;
            }
        }

        return newArray;
    }
}

package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dec15_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        int first = 0;
        int sec = 0;
        int third = 0;
        int four = 0;
        Scanner scan = new Scanner(new File("input/dec15.txt"));

        for (int i = 0; i < 123456; i++) {
            String in = scan.nextLine();

            String[] test = in.split("=");

            System.out.println(test[i]);
        }

    }

    public static int getInt(int inInt, String inS) {
        char temp = ' ';
        char temp2 = ' ';
        String sTemp = "";

        for (int i = 0; i< inS.length(); i++) {
            temp = inS.charAt(inInt+i);
            if (temp == ',' || temp == ' ' || temp == ';') {
                break;
            } else {
                sTemp += temp + "";
            }
        }
        return Integer.parseInt(sTemp);
    }
}

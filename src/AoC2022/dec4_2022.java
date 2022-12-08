package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dec4_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        String in = "";
        int total = 0;
        Scanner scan = new Scanner(new File("input/dec4.txt"));
        int first = 0;
        int sec = 0;
        int third = 0;
        int four = 0;

        for (int i = 0; i < 1000; i++) {
            in = (scan.nextLine()+" ");

            first = getInt(0, in);      //These wont work bc the inInt value are at diff spots
            if (first < 10) {
                sec = getInt(2, in);
            } else {
                sec = getInt(3, in);
            }

            if (first < 10 && sec < 10) {
                third = getInt(5-1, in);
            } else if (first >= 10 && sec >= 10) {
                third = getInt(7-1, in);
            } else {
                third = getInt(6-1, in);
            }

            if (first < 10 && sec < 10 && third < 10) {
                four = getInt(6, in);
            } else if (first >= 10 && sec >= 10 && third >= 10) {
                four = getInt(9, in);
            } else if ((first < 10 && sec >= 10 && third >= 10) || (first >= 10 && sec >= 10 && third < 10) || (first >= 10 && sec < 10 && third >= 10)) {
                four = getInt(8, in);
            } else {
                four = getInt(7, in);
            }


            if (first <= third && sec >= four) {
                total++;
            } else if(first >= third && sec <= four) {
                total++;
            }

        }

        System.out.println(total);
    }

    public static int getInt(int inInt, String inS) {
        char temp = ' ';
        char temp2 = ' ';
        String sTemp = "";

        temp = inS.charAt(inInt);
        temp2 = inS.charAt(inInt+1);
        if (temp2 == ',' || temp2 == ' ' || temp2 == '-') {
            sTemp = (temp + "");
        } else {
            sTemp = (temp + "" + temp2);
        }
        return Integer.parseInt(sTemp);
    }
}

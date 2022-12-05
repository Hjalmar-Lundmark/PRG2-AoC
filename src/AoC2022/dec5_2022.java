package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dec5_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        char[] stack1 = new char[20];
        ArrayList<Character> stack12 = new ArrayList<Character>();
        char[] stack2 = new char[20];
        char[] stack3 = new char[20];
        char[] stack4 = new char[20];
        char[] stack5 = new char[20];
        char[] stack6 = new char[20];
        char[] stack7 = new char[20];
        char[] stack8 = new char[20];
        char[] stack9 = new char[20];
        String in = "";
        int p = 0;
        Scanner scan = new Scanner(new File("input/dec5.txt"));
        char antal = ' ';
        int antalInt = 0;
        char from = ' ';
        char to = ' ';

        //in = dec2_2022.altReadFile("input/dec5.txt");
        while (true) {
            in = scan.nextLine();
            /*
            part = "";
            for (int q = 0; q < 36; q++) {       //Creates a full row
                if (in.charAt(p) != '\n') {
                    part += in.charAt(p);
                }
                p++;
                if (in.charAt(p) == '\n') {
                    break;
                }
            }

            for (int i = 0; i < 123; i++) {

            }

             */

            if (p<8) {
                stack1[p] = in.charAt(1);
                stack12.add(in.charAt(1));
                stack2[p] = in.charAt(5);
                stack3[p] = in.charAt(9);
                stack4[p] = in.charAt(13);
                stack5[p] = in.charAt(17);
                stack6[p] = in.charAt(21);
                if (in.length() > 24) {
                    stack7[p] = in.charAt(25);
                    if (in.length() > 28) {
                        stack8[p] = in.charAt(29);
                        if (in.length() > 32) {
                            stack9[p] = in.charAt(33);
                        }
                    }
                }
            }

            if (p > 10) {
                //move stuff, do I need arraylist???
                antal = in.charAt(5);
                from = in.charAt(12);
                to = in.charAt(17);

                //move
                antalInt = Integer.parseInt(antal + "");
                stack12.addAll(1, stack12);
                stack12.add(0, 'Å');
            }

            p++;        //nr of rows read

            if (!scan.hasNext()) {
                break;
            }
        }


    }
}

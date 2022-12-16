package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dec5_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Character> stack1 = new ArrayList<Character>();
        ArrayList<Character> stack2 = new ArrayList<Character>();
        ArrayList<Character> stack3 = new ArrayList<Character>();
        ArrayList<Character> stack4 = new ArrayList<Character>();
        ArrayList<Character> stack5 = new ArrayList<Character>();
        ArrayList<Character> stack6 = new ArrayList<Character>();
        ArrayList<Character> stack7 = new ArrayList<Character>();
        ArrayList<Character> stack8 = new ArrayList<Character>();
        ArrayList<Character> stack9 = new ArrayList<Character>();
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
                if (in.charAt(1) != ' ') {
                    stack1.add(in.charAt(1));
                }
                if (in.charAt(5) != ' ') {
                    stack2.add(in.charAt(5));
                }
                if (in.charAt(9) != ' ') {
                    stack3.add(in.charAt(9));
                }
                if (in.charAt(13) != ' ') {
                    stack4.add(in.charAt(13));
                }
                if (in.charAt(17) != ' ') {
                    stack5.add(in.charAt(17));
                }
                if (in.charAt(21) != ' ') {
                    stack6.add(in.charAt(21));
                }
                if (in.length() > 24) {
                    if (in.charAt(25) != ' ') {
                        stack7.add(in.charAt(25));
                    }
                    if (in.length() > 28) {
                        if (in.charAt(29) != ' ') {
                            stack8.add(in.charAt(29));
                        }
                        if (in.length() > 32) {
                            if (in.charAt(33) != ' ') {
                                stack9.add(in.charAt(33));
                            }
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
                stack1.addAll(0, stack1);
                stack1.add(0, 'Å');
                stack1.remove(7);
            }

            p++;        //nr of rows read

            if (!scan.hasNext()) {
                break;
            }
        }


    }
}

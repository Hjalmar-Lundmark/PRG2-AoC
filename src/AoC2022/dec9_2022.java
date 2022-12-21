package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dec9_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        int HX = 0;
        int HY = 0;
        int TX = 0;
        int TY = 0;
        String in = "";
        Scanner scan = new Scanner(new File("input/dec9.txt"));
        char c = ' ';
        String temp = "";
        int delta = 0;
        ArrayList<Integer> places = new ArrayList<Integer>();   //fix, need int or something instead as checking coords doesnt work

        for (int i = 0; i < 2000; i++) {
            in = scan.nextLine();

            delta = dec4_2022.getInt(2, in);

            places.add(TX);
            //doesnt work in diagonal right now
            if (in.charAt(0) == 'R') {
                for (int o = 0; o < delta; o++) {
                    HX++;
                    if (TY < HY && TX < HX-1) {
                        TY++;
                        TX++;
                    } else if (TY > HY && TX < HX-1) {
                        TY--;
                        TX++;
                    } else if (TX < HX-1) {
                        TX++;
                        if (!places.contains(TX)) {
                            places.add(TX);
                        }
                    }
                }
            } else if (in.charAt(0) == 'L') {
                for (int o = 0; o < delta; o++) {
                    HX -= 1;
                    if (TX > HX+1) {
                        TX -= 1;
                        if (!places.contains(TX)) {
                            places.add(TX);
                        }
                    }
                }
            } else if (in.charAt(0) == 'U') {
                for (int o = 0; o < delta; o++) {
                    HY++;
                    if (TY < HY-1) {
                        TY++;
                        if (!places.contains(TX)) {
                            places.add(TX);
                        }
                    }
                }
            } else {
                for (int o = 0; o < delta; o++) {
                    HY -= 1;
                    if (TY > HY+1) {
                        TY -= 1;
                        if (!places.contains(TX)) {
                            places.add(TX);
                        }
                    }
                }
            }
        }

        System.out.println(places.toArray().length);
    }
}

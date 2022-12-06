package AoC2022;

import java.io.FileNotFoundException;

public class dec6_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        char one = ' ';
        char two = ' ';
        char three = ' ';
        char four = ' ';
        String in = "";
        int nr = 0;
        char[] p2 = new char[14];
        boolean brea = false;

        in = dec2_2022.altReadFile("input/dec6.txt");
        for (int i = 0; i < in.length()-13; i++) {
            nr = i;
            /*          //part 1
            one = in.charAt(i);
            two = in.charAt(i+1);
            three = in.charAt(i+2);
            four = in.charAt(i+3);
            if (one != two && one != three && one != four && two != three && two != four && three != four) {
                break;
            } */

            for (int o = 0; o < 14; o++) {
                p2[i+o] = in.charAt(i+o);
            }

            //Probably a bad idea
            //This is maybe what is crashing the file
            if (p2[0] != p2[1] && p2[0] != p2[2] && p2[0] != p2[3] && p2[0] != p2[4] && p2[0] != p2[5] && p2[0] != p2[6] && p2[0] != p2[7] && p2[0] != p2[8] && p2[0] != p2[9] && p2[0] != p2[10] && p2[0] != p2[11] && p2[0] != p2[12] && p2[0] != p2[13]) {
                if (p2[1] != p2[2] && p2[1] != p2[3] && p2[1] != p2[4] && p2[1] != p2[5] && p2[1] != p2[6] && p2[1] != p2[7] && p2[1] != p2[8] && p2[1] != p2[9] && p2[1] != p2[10] && p2[1] != p2[11] && p2[1] != p2[12] && p2[1] != p2[13]) {
                    if (p2[2] != p2[3] && p2[2] != p2[4] && p2[2] != p2[5] && p2[2] != p2[6] && p2[2] != p2[7] && p2[2] != p2[8] && p2[2] != p2[9] && p2[2] != p2[10] && p2[2] != p2[11] && p2[2] != p2[12] && p2[2] != p2[13]) {
                        if (p2[3] != p2[4] && p2[3] != p2[5] && p2[3] != p2[6] && p2[3] != p2[7] && p2[3] != p2[8] && p2[3] != p2[9] && p2[3] != p2[10] && p2[3] != p2[11] && p2[3] != p2[12] && p2[3] != p2[13]) {
                            if (p2[4] != p2[5] && p2[4] != p2[6] && p2[4] != p2[7] && p2[4] != p2[8] && p2[4] != p2[9] && p2[4] != p2[10] && p2[4] != p2[11] && p2[4] != p2[12] && p2[4] != p2[13]) {
                                if (p2[5] != p2[6] && p2[5] != p2[7] && p2[5] != p2[8] && p2[5] != p2[9] && p2[5] != p2[10] && p2[5] != p2[11] && p2[5] != p2[12] && p2[5] != p2[13]) {
                                    if (p2[6] != p2[7] && p2[6] != p2[8] && p2[6] != p2[9] && p2[6] != p2[10] && p2[6] != p2[11] && p2[6] != p2[12] && p2[6] != p2[13]) {
                                        if (p2[7] != p2[8] && p2[7] != p2[9] && p2[7] != p2[10] && p2[7] != p2[11] && p2[7] != p2[12] && p2[7] != p2[13]) {
                                            if (p2[8] != p2[9] && p2[8] != p2[10] && p2[8] != p2[11] && p2[8] != p2[12] && p2[8] != p2[13]) {
                                                if (p2[9] != p2[10] && p2[9] != p2[11] && p2[9] != p2[12] && p2[9] != p2[13]) {
                                                    if (p2[10] != p2[11] && p2[10] != p2[12] && p2[10] != p2[13]) {
                                                        if (p2[11] != p2[12] && p2[11] != p2[13]) {
                                                            if (p2[12] != p2[13]) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //Faulty logic in if-loops
            //Should maybe do an int to check the amount of non dupes
            /*
            for (int p = 0; p < 14; p++) {
                for (int w = 0; w < 14; w++) {
                    if (p != w) {
                        if (p2[p] == p2[w]) {       //stupid
                            brea = true;
                            break;
                        }
                    }
                }
                if (brea) {
                    break;
                }
            }
            if (brea) {
                break;
            }
            */
        }
        System.out.println(nr+14);
    }
}

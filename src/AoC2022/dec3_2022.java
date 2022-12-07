package AoC2022;

import java.io.FileNotFoundException;
import java.util.Locale;

public class dec3_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        int i = -1;
        int charTest = 0;
        char c = ' ';
        int total = 0;
        String sting = "";
        String fHalf = "";
        String lHalf = "";
        String thirdHalf = "";
        char dupe = ' ';
        int third = 0;

        String in = dec2_2022.altReadFile("input/dec3.txt");
        int test = in.length();
        while (true) {
            sting = "";
            for (int w = 0; w < 1000; w++) {
                i++;
                if (i >= in.length()) {
                    break;
                }
                if (in.charAt(i) != ' ') {
                    sting += in.charAt(i);
                }
                if (in.charAt(i) == ' ') {
                    third++;
                    if (third > 3) {
                        third = 1;
                    }
                    if (third == 1) {
                        fHalf = sting;
                    } else if (third == 2) {
                        lHalf = sting;
                    } else {
                        thirdHalf = sting;
                    }
                    break;
                }
            }
            if (i >= in.length()) {
                break;
            }

            //Part 1
            /*
            //check dupes
            dupe = ' ';
            fHalf = sting.substring(0, (sting.length()/2));
            lHalf = sting.substring((sting.length()/2), sting.length());
            for (int p = 0; p < fHalf.length(); p++) {
                for (int q = 0; q < fHalf.length(); q++) {
                    if (fHalf.charAt(p) == lHalf.charAt(q) && fHalf.charAt(p) != dupe) {
                        c = fHalf.charAt(p);
                        total += givePoints(c);
                        dupe = c;
                    }
                }

            }
             */
            //part 2
            if (thirdHalf != "") {
                dupe = ' ';
                for (int p = 0; p < fHalf.length(); p++) {
                    for (int q = 0; q < lHalf.length(); q++) {
                        for (int e = 0; e < thirdHalf.length(); e++) {
                            if (fHalf.charAt(p) == lHalf.charAt(q) && fHalf.charAt(p) == thirdHalf.charAt(e) && fHalf.charAt(p) != dupe) {
                                c = fHalf.charAt(p);
                                total += givePoints(c);
                                dupe = c;
                            }
                        }
                    }

                }

                fHalf = "";
                lHalf = "";
                thirdHalf = "";
            }

            if (i >= in.length()) {
                break;
            }
        }
        System.out.println(total);

    }

    public static int givePoints(char e) {
        String convertion = "";
        convertion += e;
        convertion = convertion.toLowerCase();
        char e2 = convertion.charAt(0);
        if (e == e2) {
            return (((int) e)-96);
        } else {
            return (((int) e)-38);
        }
    }
}

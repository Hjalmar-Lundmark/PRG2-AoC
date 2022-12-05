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
        char dupe = ' ';

        String in = dec2_2022.altReadFile("input/dec3.txt");
        while (true) {
            sting = "";
            for (int w = 0; w < 50; w++) {
                i++;
                if (i >= in.length()) {
                    break;
                }
                if (in.charAt(i) != ' ') {
                    sting += in.charAt(i);
                }
                if (in.charAt(i) == ' ') {

                    break;
                }
            }
            if (i >= in.length()) {
                break;
            }

            //check dupes
            dupe = ' ';
            fHalf = sting.substring(0, (sting.length()/2));
            lHalf = sting.substring((sting.length()/2), sting.length());
            for (int p = 0; p < fHalf.length(); p++) {
                for (int q = 0; q < fHalf.length()-1; q++) {
                    if (fHalf.charAt(p) == lHalf.charAt(q) && fHalf.charAt(p) != dupe) {
                        c = fHalf.charAt(p);
                        total += givePoints(c);
                        dupe = c;
                    }
                }

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

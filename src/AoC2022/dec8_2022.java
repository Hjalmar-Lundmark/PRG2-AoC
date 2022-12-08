package AoC2022;

import java.io.FileNotFoundException;

public class dec8_2022 {
    public static void main(String[] args) throws FileNotFoundException {
        int total = 0;
        String in = "";
        int height = 0;
        String row = "";

        in = dec2_2022.altReadFile("input/dec8.txt");

        for (int i = 0; i < in.length(); i++) {
            int test = in.charAt(i);
            char c = in.charAt(i);

            if (i < 100) {
                total++;
            } else if (in.charAt(i-1) == ' ' || in.charAt(i+1) == ' ') {    //could work but in.charAt(1) = '1' or 49 as int
                total++;
            } else if (in.charAt(i) <= in.charAt(i-99)) { //Checks top but it doesnt always need to

            }
        }
    }
}

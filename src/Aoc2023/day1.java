import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1 {
    public static void main(String[] args) {
        String in = readFile("day1.txt");
        String[] lines = in.split(" ");
        char[] chars;
        int total = 0;
        int firstInt = 0;
        int lastInt = 0;
        boolean part2 = true;
        String threeLetter;
        String fourLetter;
        String fiveLetter;

        for (int i = 0; i < lines.length; i++) {
            // get first int
            chars = lines[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (isInt(chars[j])) {
                    firstInt = Integer.parseInt(String.valueOf(chars[j]));
                    break;
                }
                // ugly solution
                else if (part2) {
                    if((j+2) >= chars.length) {
                        threeLetter = "";
                    } else {
                        threeLetter = chars[j] + "" + chars[j+1] + chars[j+2];
                    }

                    if((j+3) >= chars.length) {
                        fourLetter = "";
                    } else {
                        fourLetter = chars[j] + "" + chars[j+1] + chars[j+2] + chars[j+3];
                    }

                    if((j+4) >= chars.length) {
                        fiveLetter = "";
                    } else {
                        fiveLetter = chars[j] + "" + chars[j+1] + chars[j+2] + chars[j+3] + chars[j+4];
                    }


                    if (threeLetter.equals("one")) {
                        firstInt = 1;
                        break;
                    } else if (threeLetter.equals("two")) {
                        firstInt = 2;
                        break;
                    } else if (fiveLetter.equals("three")) {
                        firstInt = 3;
                        break;
                    } else if (fourLetter.equals("four")) {
                        firstInt = 4;
                        break;
                    } else if (fourLetter.equals("five")) {
                        firstInt = 5;
                        break;
                    } else if (threeLetter.equals("six")) {
                        firstInt = 6;
                        break;
                    } else if (fiveLetter.equals("seven")) {
                        firstInt = 7;
                        break;
                    } else if (fiveLetter.equals("eight")) {
                        firstInt = 8;
                        break;
                    } else if (fourLetter.equals("nine")) {
                        firstInt = 9;
                        break;
                    }
                }
            }

            // get second int
            chars = reverse(chars);
            for (int j = 0; j < chars.length; j++) {
                if (isInt(chars[j])) {
                    lastInt = Integer.parseInt(String.valueOf(chars[j]));
                    break;
                }
                // ugly solution
                else if (part2) {
                    if((j+2) >= chars.length) {
                        threeLetter = "";
                    } else {
                        threeLetter = chars[j] + "" + chars[j+1] + chars[j+2];
                    }

                    if((j+3) >= chars.length) {
                        fourLetter = "";
                    } else {
                        fourLetter = chars[j] + "" + chars[j+1] + chars[j+2] + chars[j+3];
                    }

                    if((j+4) >= chars.length) {
                        fiveLetter = "";
                    } else {
                        fiveLetter = chars[j] + "" + chars[j+1] + chars[j+2] + chars[j+3] + chars[j+4];
                    }


                    if (threeLetter.equals("eno")) {            //one
                        lastInt = 1;
                        break;
                    } else if (threeLetter.equals("owt")) {     //two
                        lastInt = 2;
                        break;
                    } else if (fiveLetter.equals("eerht")) {    //three
                        lastInt = 3;
                        break;
                    } else if (fourLetter.equals("ruof")) {     //four
                        lastInt = 4;
                        break;
                    } else if (fourLetter.equals("evif")) {     //five
                        lastInt = 5;
                        break;
                    } else if (threeLetter.equals("xis")) {     //six
                        lastInt = 6;
                        break;
                    } else if (fiveLetter.equals("neves")) {    //seven
                        lastInt = 7;
                        break;
                    } else if (fiveLetter.equals("thgie")) {    //eight
                        lastInt = 8;
                        break;
                    } else if (fourLetter.equals("enin")) {     //nine
                        lastInt = 9;
                        break;
                    }
                }
            }

            total = total + (firstInt * 10) + lastInt;
        }
        System.out.println(total);
    }

    public static char[] reverse(char[] c) {
        char[] newArray = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            newArray[i] = c[c.length-i-1];
        }
        return newArray;
    }

    public static boolean isInt(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
            return true;
        } else {
            return false;
        }
    }

    public static String readFile(String filnamn) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            m2 = inFil.readLine();
            while (m2 != null) {
                // read next line
                meddelande += m2;
                meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }
}
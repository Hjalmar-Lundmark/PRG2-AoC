package Aoc2024;

import static java.lang.Character.isDigit;

public class day3 {
    public static void main(String[] args) {
        int result = 0;
        String number1;
        String number2;
        boolean commaFound;
        boolean endedCorrectly = true;
        String content = "";

        content = globalFuncs.readFile("input/Aoc2024/day3.txt");

        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) == 'm' && content.charAt(i+1) == 'u' && content.charAt(i+2) == 'l' && content.charAt(i+3) == '(') {
                System.out.println("numbers reseting");
                number1 = "";
                number2 = "";
                commaFound = false;
                for (int j = 0; ; j++) {
                    endedCorrectly = true;
                    if (content.charAt(i+4+j) == ')') {
                        break;
                    }

                    boolean isDigit = isDigit(content.charAt(i+4+j));

                    if (content.charAt(i+4+j) == ',') {
                        commaFound = true;
                    }

                    if (isDigit) {
                        if (!commaFound) {
                            number1 += content.charAt(i+4+j);
                            System.out.println(number1);
                        } else {
                            number2 += content.charAt(i+4+j);
                            System.out.println(number2);
                        }
                    } else if (content.charAt(i+4+j) != ',') {
                        endedCorrectly = false;
                        break;
                    }
                }

                if (!number1.equals("") && !number2.equals("") && endedCorrectly) {
                    result += (Integer.parseInt(number1) * Integer.parseInt(number2));
                }
            }
        }

        System.out.println(result);
    }
}

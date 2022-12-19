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
                //move stuff
                antal = in.charAt(5);
                from = in.charAt(12);
                to = in.charAt(17);

                //move
                antalInt = Integer.parseInt(antal + "");

                //stack1.add(0, 'Å');

                for (int i = 0; i < antalInt; i++) {
                    if (from == '1') {
                        if (to == '2') {
                            stack2.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '3') {
                            stack3.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '4') {
                            stack4.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '5') {
                            stack5.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '6') {
                            stack6.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '7') {
                            stack7.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '8') {
                            stack8.add(0, stack1.get(0));
                            stack1.remove(0);
                        } else if (to == '9') {
                            stack9.add(0, stack1.get(0));
                            stack1.remove(0);
                        }
                    } else if (from == '2') {
                        if (to == '1') {
                            stack1.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '3') {
                            stack3.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '4') {
                            stack4.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '5') {
                            stack5.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '6') {
                            stack6.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '7') {
                            stack7.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '8') {
                            stack8.add(0, stack2.get(0));
                            stack2.remove(0);
                        } else if (to == '9') {
                            stack9.add(0, stack2.get(0));
                            stack2.remove(0);
                        }
                    } else if (from == '3') {
                        //stack1
                        if (to == '1') {
                            stack1.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '2') {
                            stack2.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '4') {
                            stack4.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '5') {
                            stack5.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '6') {
                            stack6.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '7') {
                            stack7.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '8') {
                            stack8.add(0, stack3.get(0));
                            stack3.remove(0);
                        } else if (to == '9') {
                            stack9.add(0, stack3.get(0));
                            stack3.remove(0);
                        }
                    } else if (from == '4') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    } else if (from == '5') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    } else if (from == '6') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    } else if (from == '7') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    } else if (from == '8') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    } else if (from == '9') {
                        //stack1
                        if (to == '1') {

                        } else if (to == '3') {

                        } else if (to == '4') {

                        } else if (to == '5') {

                        } else if (to == '6') {

                        } else if (to == '7') {

                        } else if (to == '8') {

                        } else if (to == '9') {

                        }
                    }
                }
            }

            p++;        //nr of rows read

            if (!scan.hasNext()) {
                break;
            }
        }


    }
}

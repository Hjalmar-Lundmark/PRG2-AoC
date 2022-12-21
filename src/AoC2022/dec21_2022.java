package AoC2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dec21_2022 {
    private String name;
    private int num;

    public dec21_2022(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "dec21_2022{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input/dec21.txt"));
        String in;
        dec21_2022[] monkey = new dec21_2022[2100];
        int i = 0;
        String[] test = new String[2];

        while (scan.hasNext()) {
            in = scan.nextLine();
            test = in.split(": ");
            System.out.println(test[1]);
            monkey[i] = new dec21_2022((in.charAt(0) + "" + in.charAt(1) + in.charAt(2) + in.charAt(3)), Integer.parseInt(test[1]));
            i++;
        }


    }
}

package Exercises.Chapter2;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a length:");
        int length = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Choose a width:");
        int width = input2.nextInt();
        double area = length * width;
        System.out.println("The radius is " + area);

    }
}

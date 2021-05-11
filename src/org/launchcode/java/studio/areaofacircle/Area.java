package org.launchcode.java.studio.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        if (radius < 0) {
            while (radius < 0) {
                System.out.println("Error: Must be a positive number!");
                radius = input.nextDouble();
            }
        }
        input.close();
    }
}

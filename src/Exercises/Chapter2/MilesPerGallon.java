package Exercises.Chapter2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("How many gallons has your car consumed?");
        double gasConsumed = input.nextDouble();
        double calculation = milesDriven/gasConsumed;
        System.out.println("Your car consumes " + calculation + " miles per gallon.");

    }
}

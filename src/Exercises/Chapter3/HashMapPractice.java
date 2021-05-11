package Exercises.Chapter3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("What is the student's ID?");
        Integer studentID = input.nextInt();
        System.out.println("What is the student's name?");
        String studentName = input.nextLine();

        students.put(studentID, studentName);


    }
}

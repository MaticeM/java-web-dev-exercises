package Exercises.Chapter3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        Integer sum = 0;

        ArrayList<Integer> someIntegers = new ArrayList<>();
        someIntegers.add(1);
        someIntegers.add(3);
        someIntegers.add(7);
        someIntegers.add(10);
        someIntegers.add(13);
        someIntegers.add(17);
        someIntegers.add(21);
        someIntegers.add(23);
        someIntegers.add(27);
        someIntegers.add(30);

        for (Integer i : someIntegers) {
            if (i%2==0) {
                sum += i;
                System.out.println(sum);
            }
        }

//        ArrayList<String> phrase = new ArrayList<>(Arrays.asList("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse."));

        String phrase = ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String[] phraseArray = phrase.split(" ");
        List<String> finalPhrase = new ArrayList<>();
        finalPhrase = Arrays.asList(phraseArray);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length.");
        Integer wordLength = input.nextInt();

        for (String i : finalPhrase) {
            if (wordLength == i.length()) {
                System.out.println(i);
            }
        }
    }
}

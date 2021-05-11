package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Character;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote: ");
        String quote = input.nextLine().toUpperCase();
        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> characterMap = new HashMap<>();

        for (Character i: charactersInString) {
            if (!(characterMap.containsKey(i))) {
                characterMap.put(i, 1);
            } else {
                characterMap.put(i, characterMap.get(i)+1);
            }
            }
        for (Map.Entry<Character, Integer> mapEntry : characterMap.entrySet()) {
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
        }
        }
    }


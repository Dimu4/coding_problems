package com.example.borysgurtovyi.codinginterviewprep;

import java.util.HashMap;

/**
 * Created by borysgurtovyi on 2/1/18.
 */

public class HowManyChars {

    // str = "Hello, Ultimate Bootcamp!"
    // ['h','e','l','l','o',',',' '....]

    public void howManyChars(String str) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for(char ch : str.toCharArray() ){
            if(!myHashMap.containsKey(ch)) {
                myHashMap.put(ch, 1);
            } else {
                int oldNumberOfCharacter = myHashMap.get(ch);
                int newNumber = oldNumberOfCharacter + 1;
                myHashMap.put(ch, newNumber);
            }
        }

        for(char ch : myHashMap.keySet()) {
            int value = myHashMap.get(ch);
            System.out.println(ch +" => " + value);
        }
    }
}

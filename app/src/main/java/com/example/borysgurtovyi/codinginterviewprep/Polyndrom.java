package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by borysgurtovyi on 2/8/18.
 */

public class Polyndrom {

    // String str = "racecar";

    public boolean isPolyndrom(String str){
        char[] strArray = str.toCharArray();
         for(int i = 0; i < strArray.length / 2; i++) {
            if(strArray[i] != strArray[strArray.length -1 - i]) {
                return false;
            }
        }
        return true;
    }

}

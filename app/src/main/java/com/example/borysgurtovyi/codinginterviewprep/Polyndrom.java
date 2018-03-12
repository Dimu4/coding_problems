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

    public boolean isPolyndromRecursive(String str) {

        if(str.length()<2) {
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)) {
            String substr = str.substring(1,str.length()-1);
            return isPolyndromRecursive(substr);
        } else {
            return false;
        }
    }

}

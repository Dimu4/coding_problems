package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 06.02.2018.
 */

open class HowManyCharsK {
    fun howManyChars(string: String){
        val myMap = HashMap<Char, Int>()

        for(ch in string.toCharArray()){
            if (!myMap.containsKey(ch)){
                    myMap.put(ch, 1)
            } else {
                val number = myMap.getValue(ch) + 1
                myMap.put(ch, number)
            }
        }
        for (ch in myMap.keys) {
            println(ch + " ==> " + myMap.getValue(ch))
        }
    }
}
package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 06.02.2018.
 */

open class HowManyCharsK {
    fun howManyChars(string: String){
        val myMap = HashMap<Char, Int>()

        for(ch in string.toCharArray()){
            myMap[ch] = (myMap[ch] ?: 0) + 1
        }
        for (ch in myMap.keys) {
            val number = myMap[ch]
            println(ch + " ==> " + number)
        }
    }
}
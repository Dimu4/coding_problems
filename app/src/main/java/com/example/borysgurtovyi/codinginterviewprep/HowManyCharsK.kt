package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by borysgurtovyi on 2/8/18.
 */

class HowManyCharsK {

    fun howManyChars(str: String) {

        val myHashMap = HashMap<Char, Int>()

        for (ch in str.toCharArray()) {
            myHashMap[ch] = (myHashMap[ch] ?: 0) + 1
        }

        for (ch in myHashMap.keys) {
            val value = myHashMap[ch]
            println(ch + " => " + value)
        }
    }

}
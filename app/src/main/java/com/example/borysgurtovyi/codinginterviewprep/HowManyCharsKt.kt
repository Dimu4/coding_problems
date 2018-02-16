package com.example.borysgurtovyi.codinginterviewprep

import java.util.HashMap

/**
 * Created by aliyaserikbol on 2/2/18.
 */

class HowManyCharsKt {

    // str = "Hello, Ultimate Bootcamp!"
    // ['h','e','l','l','o',',',' '....]

    fun howManyChars(str: String) {
        val myHashMap: HashMap<Char, Int> = HashMap<Char, Int>()

        for (ch in str.toCharArray()) {
            if (!myHashMap.containsKey(ch)) {
                myHashMap[ch] = 1
            } else {
                val oldNumberOfCharacter = myHashMap[ch]
                val newNumber = oldNumberOfCharacter?.plus(1)
//                if (newNumber != null) {
                myHashMap[ch] = newNumber ?: -1
//            }
            }

            for (ch in myHashMap.keys) {
                val value = myHashMap[ch]
                println(ch + " => " + value)
            }
        }
    }
}



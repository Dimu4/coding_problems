package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 15.02.2018.
 */
class Palindrom {

    fun palindrom(string: String): Boolean {
        val strArray: CharArray = string.toCharArray()
        for (i in (0..strArray.size / 2)){
            if (strArray[i] != strArray[strArray.size - 1 - i]){
                return false
            }
        }
        return true
    }
}
package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 18.02.2018.
 */
class PalindromIntK{
    fun isPalindrome(x: Int): Boolean {
        var newX = x
        var reversedX = 0
        while (newX > 0){
            var reminder = newX % 10
            reversedX = reversedX * 10 + reminder
            newX /= 10
        }
        return x == reversedX
    }
}
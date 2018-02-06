package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 06.02.2018.
 */

open class Solution{
    fun fizzBuzz(n: Int): MutableList<String> {
        var resultList: MutableList<String> = mutableListOf()
        for (i in 1..n) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz")
            } else if (i % 3 == 0) {
                resultList.add("Fizz")
            } else if (i % 5 == 0) {
                resultList.add("Buzz")
            } else resultList.add(i.toString())
        }
        return resultList
    }
}
package com.example.borysgurtovyi.codinginterviewprep

import org.junit.Test

/**
 * Created by lisa on 15.02.2018.
 */
class MoveZeroesKTest {

    @Test
    fun moveZeroesTest(){
        val moveZeroes = MoveZeroesK()
        val nums: Array<Int> = arrayOf(0,1,0,3,12,64,0,7)
        moveZeroes.moveZeroes(nums)
        println(nums.asList())
    }
}


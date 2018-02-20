package com.example.borysgurtovyi.codinginterviewprep

import org.junit.Test

/**
 * Created by lisa on 15.02.2018.
 */
class MoveZeroesTest {

    @Test
    fun moveZeroesTest(){
        val moveZeroes = MoveZeroes()
        val nums: Array<Int> = arrayOf(0,1,0,3,12)
        moveZeroes.moveZeroes(nums)
        println(nums.asList())
    }
}


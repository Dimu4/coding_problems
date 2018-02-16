package com.example.borysgurtovyi.codinginterviewprep

/**
 * Created by lisa on 15.02.2018.
 */
class MoveZeroes{

    fun moveZeroes(nums: Array<Int>) {
        var i = 0
        var k = 0
        for (i in 0..nums.size - 1){
            if (nums[i] != 0){
                nums[k] = nums[i]
                k += 1
            }
        }
        for (k in k..nums.size - 1){
            nums[k] = 0
        }
    }
}
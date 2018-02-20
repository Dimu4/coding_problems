package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by lisa on 16.02.2018.
 */

public class MoveZeroesJ {

    public void moveZeroes(int[] nums) {
        int k = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for ( ; k < nums.length; k++){
            nums[k] = 0;
        }
    }
}

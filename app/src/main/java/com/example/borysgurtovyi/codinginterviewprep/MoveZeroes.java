package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by borysgurtovyi on 2/12/18.
 */

public class MoveZeroes {


    //   [0, 1, 0, 3, 12]

    //   [1, 3, 12, 3, 12]

    //   [1, 3, 12, 0, 0]



    // 1, 2, 50, 7, 10

    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 ) {
                nums[k] = nums[i];
                k++;
            }
        }

        for( ; k < nums.length ; k++ ) {
            nums[k] = 0;
        }
    }
}

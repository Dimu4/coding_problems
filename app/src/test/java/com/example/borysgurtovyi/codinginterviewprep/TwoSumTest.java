package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

/**
 * Created by borysgurtovyi on 2/22/18.
 */

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        TwoSum twoSum = new TwoSum();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        twoSum.twoSum(nums, target);
    }
}

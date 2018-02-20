package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lisa on 16.02.2018.
 */

public class MoveZeroesJTest {

    @Test
    public void moveZeroesJ(){
        MoveZeroesJ moveZeroesJ = new MoveZeroesJ();
        int[] nums = {0, 1, 0, 3, 12, 0, 67, 4};
        moveZeroesJ.moveZeroes(nums);
        System.out.println(Arrays.toString( nums));
    }
}

package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by borysgurtovyi on 2/12/18.
 */

public class MoveZeroesTest {

    @Test
    public void testMoveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

    }

}

package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

/**
 * Created by borysgurtovyi on 1/29/18.
 */

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzzClass = new FizzBuzz();
        System.out.println(fizzBuzzClass.fizzBuzz(5));
        System.out.println(fizzBuzzClass.fizzBuzz(10));
        System.out.println(fizzBuzzClass.fizzBuzz(20));
    }
}

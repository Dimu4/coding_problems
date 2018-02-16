package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

/**
 * Created by borysgurtovyi on 2/1/18.
 */

public class HowManyCharsTest {

    @Test
    public void testHowManyChars() {
        HowManyChars howManyCharsClass = new HowManyChars();
        String str = "Hello, Ultimate bootcamp!";
        howManyCharsClass.howManyChars(str);
    }

    @Test
    public void testHowManyCharsKotlin() {
        HowManyCharsK howManyCharsK = new HowManyCharsK();
        howManyCharsK.howManyChars("Hello world!");
    }
}

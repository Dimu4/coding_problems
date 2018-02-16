package com.example.borysgurtovyi.codinginterviewprep

import org.junit.Test

/**
 * Created by aliyaserikbol on 2/2/18.
 */
public class HowManyCharsTestKt {

    @Test
    private fun testHowManyCharsKt() {
        val howManyCharsClass = HowManyCharsKt()
        val str = "Welcome to California, :) How are you doing?!"
        howManyCharsClass.howManyChars(str)
    }
}

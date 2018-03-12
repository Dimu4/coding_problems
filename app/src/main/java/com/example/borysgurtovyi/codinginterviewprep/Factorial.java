package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by idorovskikh on 3/10/18.
 */

public class Factorial {

    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }
}

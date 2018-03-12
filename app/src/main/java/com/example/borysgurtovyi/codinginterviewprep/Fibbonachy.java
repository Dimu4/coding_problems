package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by idorovskikh on 3/10/18.
 */

public class Fibbonachy {

    public int fib(int x){
        if(x == 1 || x == 0 ){
            return 1;
        }

        return fib(x-1) + fib(x-2);
    }
}

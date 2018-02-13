package com.example.borysgurtovyi.codinginterviewprep;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by borysgurtovyi on 1/29/18.
 */

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for(int i = 1; i<=n; i++) {
            if(i%3 ==0 && i%5 ==0) {
               resultList.add("FizzBuzz");
            } else if (i%5==0) {
                resultList.add("Buzz");
            } else if(i%3 ==0) {
                resultList.add("Fizz");
            } else {
                resultList.add(i + "");
            }
        }
        return resultList;
    }

    // O(n)

}

package com.example.borysgurtovyi.codinginterviewprep;

import java.util.HashSet;

/**
 * Created by idorovskikh on 3/11/18.
 */

public class HappyNumber {

    HashSet<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {

        if(n==1){
            return true;
        }

        int sum = 0;

        while(n>0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        if(set.contains(sum)) {
            return false;
        }
        set.add(sum);
        return isHappy(sum);
    }

}

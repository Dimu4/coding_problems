package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by borysgurtovyi on 2/15/18.
 */

public class PolyndromInteger {


    // x = 123454321

    // x = 1

    // 5
    // 5 * 10 + 5 = 55
    // 555 = 5 * 100 + 5 * 10 + 5

    // 156 = 1 * 100 + 5* 10 + 6
    // 156 = 1
    // ====> 1*10 + 5 = 15
    // ====> 15 * 10 + 6 = 156

    public boolean isPalindrome(int x) {

        int xOld = x;
        int reversedInt = 0;

        // reversedInt = 1
        //         ====> 12
        //         =====> 1 * 10  + 2 => 12


        while(x>0) {
            int reminder = x % 10;
            reversedInt = reversedInt * 10 +  reminder;
            x /= 10;
        }
        return xOld == reversedInt;
    }
}

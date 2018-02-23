package com.example.borysgurtovyi.codinginterviewprep;

import java.util.HashMap;

/**
 * Created by borysgurtovyi on 2/22/18.
 */

public class TwoSum {

    //         0  1   2   3
    // nums = [2, 7, 11, 15], target = 9

    // O(n^2)


    public int[] twoSumN2(int[] nums, int target) {

        int result[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {

                if(i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    // O(n)

    public int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];
        HashMap<Integer, Integer> myHM = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            myHM.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++) {
           int complement = target - nums[i];
           if(myHM.containsKey(complement) && myHM.get(complement) != i) {
               int secondIndex = myHM.get(complement);
               result[0] = i;
               result[1] = secondIndex;
               return result;
           }
        }

        return result;
    }

}

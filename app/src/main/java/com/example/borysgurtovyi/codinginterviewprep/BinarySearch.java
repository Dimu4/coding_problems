package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by idorovskikh on 3/10/18.
 */

public class BinarySearch {

    public int binarySearch(int target, int[] arr) {
        return binarySearchInternal(target, arr,0, arr.length-1);
    }

    public int binarySearchInternal(int target, int[] arr, int l, int r){
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;

        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] > target){
            return binarySearchInternal(target, arr, l, mid - 1);
        } else {
            return binarySearchInternal(target, arr, mid + 1, r);
        }

    }

}

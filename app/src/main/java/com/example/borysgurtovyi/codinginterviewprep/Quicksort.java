package com.example.borysgurtovyi.codinginterviewprep;

/**
 * Created by idorovskikh on 3/11/18.
 */

public class Quicksort {

    public int[] quicksort(int[] arr) {
        quicksortInternal(arr, 0, arr.length - 1);
        return arr;
    }

    private void quicksortInternal(int[] arr, int l, int r){

        int i = l;
        int j = r;
        int pivot = arr[(l + r ) / 2];

        while( i <= j) {

            while(arr[i] < pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }

            if( i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if(l < j){
            quicksortInternal(arr, l, j);
        }
        if(i < r){
            quicksortInternal(arr, i, r);
        }

    }

}

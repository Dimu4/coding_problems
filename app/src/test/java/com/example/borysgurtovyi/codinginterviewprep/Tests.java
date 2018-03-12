package com.example.borysgurtovyi.codinginterviewprep;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by idorovskikh on 3/10/18.
 */

public class Tests {

    @Test
    public void testJudgeCircle() {
        JudgeCircle judgeCircle = new JudgeCircle();
        System.out.println(judgeCircle.judgeCircle("UDDDDLUUR"));
    }

    @Test
    public void testFibbonachi() {
        Fibbonachy fibbonachy = new Fibbonachy();
        System.out.println(fibbonachy.fib(20));
    }

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
    }

    @Test
    public void testPolyndrom() {
        Polyndrom polyndrom = new Polyndrom();
        System.out.println(polyndrom.isPolyndromRecursive("a"));
    }

    @Test
    public void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2, 5, 10, 12, 13, 19, 105};
        int target = 21;
        System.out.println(binarySearch.binarySearch(target, arr));
    }

    @Test
    public void testQuickSort(){
        int[] arr = {25, -5, 10, 122, 3, -19, -105};
        Quicksort quicksort = new Quicksort();
        System.out.println(Arrays.toString(quicksort.quicksort(arr)));
    }

}

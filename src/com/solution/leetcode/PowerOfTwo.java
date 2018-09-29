package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * @Time 2018/9/29 16:23
 **/
public class PowerOfTwo {


    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        return (n & n - 1) == 0 ;
    }


}

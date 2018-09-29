package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 258.各位相加
 * @Time 2018/9/29 19:39
 **/
public class AddDigits {


    public int addDigits(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int n = 0;
        for (char c : chars) {
            n += (c - '0');
        }
        if (n /10 == 0){
            return n;
        }
        return addDigits(n);
    }

}

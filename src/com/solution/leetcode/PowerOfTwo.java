package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description ����һ����������дһ���������ж����Ƿ��� 2 ���ݴη���
 * @Time 2018/9/29 16:23
 **/
public class PowerOfTwo {


    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        return (n & n - 1) == 0 ;
    }


}

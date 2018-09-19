package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 50. Pow(x, n) 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * @Time 2018/9/19 18:06
 **/
public class MyPow {

    public double myPow(double x, int n) {
        if (n < 0){
            return 1/pow(x,-n);
        }else {
            return pow(x,n);
        }

    }
    private double pow(double x, int n){
        if (n == 0){
            //此处未考虑x亦为0的情况
            return 1;
        }
        double ans = pow(x,n-1);
        if (n % 2 == 0){
            return ans * ans;
        }else{
            return ans*ans*x;
        }
    }
}

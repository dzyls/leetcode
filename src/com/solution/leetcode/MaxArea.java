package com.solution.leetcode;

/**
 * @Author xingdenghui
 * @Description
 * @Time 2018/9/21 10:26
 **/
public class MaxArea {


    public static int maxArea(int[] height) {
        int maxArea = 0;
        int begin = 0;
        int end = height.length - 1;
        while (begin <= end) {
            while (begin <= end) {
                int area = Math.min(height[begin], height[end]) * (end - begin);
                if (area > maxArea) {
                    maxArea = area;
                }
                end--;
            }
            end = height.length - 1;
            begin++;
        }
        return maxArea;
    }


}

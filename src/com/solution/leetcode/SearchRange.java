package com.solution.leetcode;

import java.util.Arrays;

/**
 * @Author dzyls
 * @Description 34.在排序数组中查找元素的第一个和最后一个位置
 * @Time 2018/9/21 9:49
 **/
public class SearchRange {

    /**
     *  给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     *  你的算法时间复杂度必须是 O(log n) 级别。
     *
     *  如果数组中不存在目标值，返回 [-1, -1]。
     *
     *  示例 1:
     *  输入: nums = [5,7,7,8,8,10], target = 8
     *  输出: [3,4]
     *
     *  示例 2:
     *  输入: nums = [5,7,7,8,8,10], target = 6
     *  输出: [-1,-1]
     * @param nums 数组
     * @param target 目标值
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int []result = {-1,-1};
        int begin = 0;
        int end = nums.length-1;
        while (begin <= end){
            if (result[0] == -1){
                if (nums[begin] == target){
                    result[0] = begin;
                }else {
                    begin ++;
                }
            }
            if (result[1] == -1){
                if (nums[end] == target){
                    result[1] = end;
                }else {
                    end --;
                }
            }
            if (result[0] != -1 && result[1] != -1){
                break;
            }
        }
        return result;
    }

}

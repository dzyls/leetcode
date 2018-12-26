package com.solution.leetcode2;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/12/26 16:05
 **/
public class SearchInsert {


    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }


}

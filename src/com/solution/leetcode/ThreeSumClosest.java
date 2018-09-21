package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/9/21 10:28
 **/
public class ThreeSumClosest {



    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int diffNum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int d = Math.abs(sum - target);
                    if (d < diffNum){
                        result = sum;
                        diffNum = d;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String []args){

        int []nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }


}

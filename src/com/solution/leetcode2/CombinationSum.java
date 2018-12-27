package com.solution.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/12/27 14:08
 **/
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(candidates);
        sumHandle(candidates,target,result,tempList,0);
        return result;
    }

    public void sumHandle(int []candidates,int target,List<List<Integer>> result,List<Integer> tempList,int num){
        if (target == 0){
            result.add(tempList);
            return;
        }
        if (target < candidates[0]){
            return;
        }
        for (int i = num; i < candidates.length && candidates[i] <= target; i++) {
            List<Integer> list = new ArrayList<>(tempList);
            list.add(candidates[i]);
            sumHandle(candidates,target-candidates[i],result,list,i);
        }

    }

}

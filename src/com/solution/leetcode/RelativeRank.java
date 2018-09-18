package com.solution.leetcode;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * 506.相对名次
 * @author Administrator
 *	("Gold Medal", "Silver Medal" and "Bronze Medal").
 *	使用TreeMap解题
 */
public class RelativeRank {

	public String[] findRelativeRanks(int[] nums) {
		int length = nums.length;
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for (int i = 0; i < nums.length; i++) {	
			map.put(nums[i], i);
		}
		String []strings = new String[nums.length];
		Iterator<Integer> iterator = map.keySet().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (i == length - 1) {
				strings[map.get(next)] = "Gold Medal";
			}else if (i == length -2) {
				strings[map.get(next)] = "Silver Medal";
			}else if (i == length -3) {
				strings[map.get(next)] = "Bronze Medal";
			}else {
				strings[map.get(next)] = String.valueOf(length-i);
			}
			i++;
		}
		return strings;
	}
	
}

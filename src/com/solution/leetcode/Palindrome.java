package com.solution.leetcode;
/**
 * 9. 回文数
 * @author dzyls
 *
 */
public class Palindrome {

	
	public boolean isPalindrome(int x) {
		String string = x+"";
        StringBuilder sb = new StringBuilder(x+"");
        String bs = sb.reverse().toString();
        return string.equals(bs);
    }
	
}

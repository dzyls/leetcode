package com.solution.leetcode;

import java.util.Arrays;

/**
 * @Author dzyls
 * @Description 有效的字母异位词
 * @Time 2018/9/29 19:29
 **/
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }

}

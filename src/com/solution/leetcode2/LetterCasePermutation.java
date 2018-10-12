package com.solution.leetcode2;

import java.util.*;

/**
 * @Author dzyls
 * @Description 784.大小写全排列
 * @Time 2018/10/12 13:47
 * @URL https://leetcode-cn.com/problems/letter-case-permutation/
 **/
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {

        LinkedList<String> res = new LinkedList<>();
        res.add(S);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isLetter(c)) {
                for (int j = res.size(); j>0; j--) {
                    String s = res.poll();
                    String left = s.substring(0, i);
                    String right = s.substring(i + 1);
                    res.add(left + Character.toLowerCase(c) + right);
                    res.add(left + Character.toUpperCase(c) + right);
                }
            }
        }
        return res;

    }

}

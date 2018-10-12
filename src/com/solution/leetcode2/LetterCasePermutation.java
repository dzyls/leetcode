package com.solution.leetcode2;

import java.util.*;

/**
 * @Author dzyls
 * @Description 784.大小写全排列
 * @Time 2018/10/12 13:47
 * @URL https://leetcode-cn.com/problems/letter-case-permutation/
 **/
public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String S) {

        LinkedList<String> res = new LinkedList<>();
        res.add(S);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            System.out.println(c);
            if (Character.isLetter(c)) {
                for (int j = res.size(); j>0; j--) {
                    String s = res.poll();
                    System.out.println(s);
                    String left = s.substring(0, i);
                    String right = s.substring(i + 1);
                    //System.err.println("left : "+left +" ----- right:"+right);
                    res.add(left + Character.toLowerCase(c) + right);
                    res.add(left + Character.toUpperCase(c) + right);
                }
            }

        }
        return res;

    }

    public static void main(String []args){
        String S = "a1b2ccc";
        System.out.println(letterCasePermutation(S));
    }
}

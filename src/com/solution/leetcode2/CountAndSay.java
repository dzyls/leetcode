package com.solution.leetcode2;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/12/27 13:26
 **/
public class CountAndSay {

    public String countAndSay(int n) {
        String result = "1";
        if (n==1){
            return result;
        }
        for (int i = 0; i < n-1; i++) {
            String res = "";
            char[] chars = result.toCharArray();
            int times = 1;
            for (int j = 0; j < chars.length; j++) {
                if (j == chars.length - 1 || chars[j] != chars[j+1]){
                    res += times + "" + chars[j];
                }else {
                    times ++;
                }
            }
            result = res;
        }
        return result;
    }

}

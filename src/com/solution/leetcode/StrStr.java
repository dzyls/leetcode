package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 28
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * @Time 2018/9/21 17:34
 **/
public class StrStr {



    public int strStr(String haystack, String needle) {

        if (needle.length() ==0){
            return 0;
        }else if (haystack.length() == 0){
            return  -1;
        }

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[0]){
                for (int j = 0; j < chars2.length; j++) {
                    int index = i + j;
                    if (index >= chars1.length ){
                        break;
                    }
                    if (chars2[j] != chars1[index]){
                        break;
                    }
                    if (j == chars2.length -1 && chars2[j] == chars1[index]){
                        return i;
                    }
                }
            }
        }
        return -1;

    }



}

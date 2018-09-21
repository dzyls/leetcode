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
        int length1 = haystack.length();
        int length2 = needle.length();
        if (length1 < length2){
            return -1;
        }else if (length2 == 0){
            return 0;
        }
        for (int i = 0; i < length1 - length2; i++) {
            if (haystack.substring(i,i+length2).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}

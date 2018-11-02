package com.solution.leetcode2;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/11/2 14:15
 **/
public class TitleToNumber {


    public static int titleToNumber(String s) {

        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = chars.length-1; i >= 0 ; i--) {
            int n = chars.length - i-1 ;
            int num = 1;
            for (int j = 0; j < n; j++) {
                num = num*26;
            }
            result += (chars[i] - 'A' + 1)*num;
        }
        return result;

    }

    public static void main(String []args){
        System.out.println(titleToNumber("A"));
    }


}

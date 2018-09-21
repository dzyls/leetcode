package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 12数字转罗马数字
 * @Time 2018/9/21 17:16
 **/
public class RomanNum {

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * @param num
     * @return
     *  贪心算法 o(╥﹏╥)o
     *  每次都取最大值.
     */
    public String intToRoman(int num) {
        int[] base = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                "V", "IV", "I" };
        String result = "";
        int i = 0;
        while (num != 0){
            if (num >= base[i]){
                num -= base[i];
                result += str[i];
            }else {
                i++;
            }
        }
        return result;
    }


}

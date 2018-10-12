package com.solution.leetcode2;

/**
 * @Author dzyls
 * @Description 796.Ðý×ª×Ö·û´®
 * @Time 2018/10/12 13:27
 * @URL https://leetcode-cn.com/problems/rotate-string/
 **/
public class RotateString {

    public static boolean rotateString(String A,String B){

        if (A.length() != B.length()){
            return false;
        }else if (A.length() == 0){
            return true;
        }
        if (A.equals(B)){
            return true;
        }
        int len = A.length();
        char[] chars = new char[len << 1];
        char[] cs = A.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            chars[i] = cs[i];
        }
        for (int i = 0; i < cs.length; i++) {
            chars[len + i] = cs[i];
            String str = new String(chars,i+1,len);
            System.out.println(str);
            if (str.equals(B)){
                return true;
            }
        }
        return false;
    }


}

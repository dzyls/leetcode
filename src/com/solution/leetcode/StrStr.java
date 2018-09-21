package com.solution.leetcode;

/**
 * @Author dzyls
 * @Description 28
 * ʵ�� strStr() ������
 * ����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��
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

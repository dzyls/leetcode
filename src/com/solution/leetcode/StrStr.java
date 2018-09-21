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

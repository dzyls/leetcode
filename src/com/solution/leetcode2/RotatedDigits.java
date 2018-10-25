package com.solution.leetcode2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author
 * @Description
 * @Time 2018/10/25 16:55
 **/
public class RotatedDigits {


    public static int rotatedDigits(int N) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(5,2);
        map.put(2,5);
        map.put(6,9);
        map.put(9,6);
        map.put(8,8);

        int result = 0;
        int sum;
        for (int k = 0; k < N; k++) {
            String s = String.valueOf(k);
            char[] chars = s.toCharArray();
            sum = 0;
            boolean f = true;
            for (int i = 0; i < chars.length; i++) {
                int n = chars[i] - '0';
                if (!map.containsKey(n)){
                    f = !f;
                    break;
                }else {
                    int integer = map.get(n);
                    int kck = 1;
                    for (int j = 0; j < i; j++) {
                        kck *= 10;
                    }
                    sum += kck;
                }
            }
            if (f && sum != k){
                System.out.println(k);
                result++;
            }
        }
        return result;
    }

    public static void main(String []args){
        rotatedDigits(10);
    }

}

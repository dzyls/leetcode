package com.solution.leetcode2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author dzyls
 * @Description µ¥´ÊÄ£Ê½
 * @Time 2018/10/9 15:59
 **/
public class WordPattern {


    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length){
            return false;
        }
        Map<String,String> map = new HashMap<>();
        Map<String,String> m2 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(pattern.charAt(i)+"") && !map.get(pattern.charAt(i)+"").equals(strings[i])){
                return false;
            }else if(m2.containsKey(strings[i]) && !m2.get(strings[i]).equals(pattern.charAt(i)+"")){
                return false;
            }else {
                map.put(pattern.charAt(i)+"",strings[i]);
                m2.put(strings[i],pattern.charAt(i)+"");
            }
        }
        return true;
    }



}

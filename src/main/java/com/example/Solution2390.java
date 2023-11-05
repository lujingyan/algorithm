package com.example;

public class Solution2390 {
    public String removeStars(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<s.length();i++) {
            if (s.charAt(i) == '*'){
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            } else {
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();

    }
}

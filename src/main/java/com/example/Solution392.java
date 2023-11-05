package com.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution392 {
    public static void main(String[] args) {
        String s="";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        String[] sArray = s.split("");
        String[] tArray = t.split("");
        Set<String> tSet = new HashSet<>();
        boolean b = tSet.addAll(Arrays.asList(tArray));
        if(sArray.length==1 && sArray[0]=="")return true;
        for (String i:sArray){
            if (!tSet.contains(i)){
                return false;
            }
        }
        return true;
    }
}

package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1207 {
    public static void main(String[] args) {
         int[] arr = {1,2,2,3,3,3};
        System.out.println(uniqueOccurances(arr));
    }
    public static boolean uniqueOccurances(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i:map.values()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}

package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>());
        lists.add(new ArrayList<Integer>());

        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        for (int i:nums1){
            first.add(i);
        }

        for (int i:nums2){
            second.add(i);
        }

        for (int i:first){
            if (!second.contains(i)) lists.get(0).add(i);
        }

        for (int i:second){
            if (!first.contains(i)) lists.get(1).add(i);
        }

        return lists;
    }
}

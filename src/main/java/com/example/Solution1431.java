package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largestNumber=0;

        for(int candy:candies){
            largestNumber=Math.max(candy,largestNumber);
        }

        ArrayList<Boolean> result = new ArrayList<>();

        for(int candy:candies){

            if(candy+extraCandies>=largestNumber){
                result.add(true);
            }
            if (candy+extraCandies<largestNumber){
                result.add(false);
            }

        }
        return result;
    }
}

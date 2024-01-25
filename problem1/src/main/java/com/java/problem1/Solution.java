package com.java.problem1;

public class Solution {
    public int getLongestWinningStreak(int[] roi){
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < roi.length; i++){
           if(roi[i] >= roi[i - 1]){
               count++;
           }
           else{
               max = Math.max(max, count);
               count = 1;
           }
        }
        max = Math.max(max,  count);
        return max;
    }

    public int getShortestLoosingStreak(int[] roi) {
        int min = Integer.MAX_VALUE;
        int count = 1;
        for(int i = 1; i < roi.length; i++){
            if(roi[i] < roi[i - 1]){
                count ++;
            }
            else{
                min = Math.min(min, count);
                count = 1;
            }
        }
        min = Math.min(min, count);
        return min;
    }
}

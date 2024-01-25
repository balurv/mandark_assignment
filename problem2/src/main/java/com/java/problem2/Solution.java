package com.java.problem2;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] getPairs(int nums[], int target){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(set.contains(temp)){
                // return the pair
                return new int[]{nums[i], temp};
            }
            set.add(nums[i]);
        }
        // there is no pair whose sum equals target ...
        return new int[]{-1, -1};
    }
}

package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0, compliment; i < nums.length; i++){
            compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {i, map.get(compliment)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

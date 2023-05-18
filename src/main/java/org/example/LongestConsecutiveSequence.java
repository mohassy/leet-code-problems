package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int num;
        int localResult = set.isEmpty() ? 0 : 1;
        int globalResult = localResult;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            if(set.contains(num - 1))
                continue;
            while(set.contains(++num))
                localResult++;
            if(localResult > globalResult)
                globalResult = localResult;
            localResult = 1;
        }
        return globalResult;
    }
}

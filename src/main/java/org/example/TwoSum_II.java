package org.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TwoSum_II {
    public static void main(String[] args) {
        Arrays.stream(new TwoSum_II().twoSum(new int[]{2,3,4}, 6)).forEach(System.out::println);
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target)
                return new int[]{start+1, end+1};
            else if(sum > target)
                end--;
            else
                start++;
        }
        return new int[]{-1, -1};
    }
}

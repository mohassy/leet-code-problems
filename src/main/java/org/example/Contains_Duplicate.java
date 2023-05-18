package org.example;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6,7,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num))
                return true;
        }
        return false;
    }
}
package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutions  = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int left = i+1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[left] + nums[right];
                    if(sum == -nums[i]) {
                        //found a solution
                        solutions.add(List.of(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]){ left++;}
                        while (left < right && nums[right] == nums[right - 1]){ right--;}
                        left++;
                        right--;
                    } else if (sum < -nums[i]) {
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return solutions;
    }


}

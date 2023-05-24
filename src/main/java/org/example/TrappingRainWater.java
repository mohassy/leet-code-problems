package org.example;
public class TrappingRainWater {
    public int trap(int[] height) {
        int maxLeft, maxRight, ans;
        int left = 0;
        int right = height.length - 1;
        maxLeft = maxRight = ans = 0;
        while(left < right){
            maxLeft = Math.max(height[left], maxLeft);
            maxRight = Math.max(height[right], maxRight);
            if(maxLeft < maxRight){
                ans += Math.max(0, maxLeft - height[left]);
                left++;
            }else{
                ans += Math.max(0, maxRight - height[right]);
                right--;
            }
        }
        return ans;
    }
}

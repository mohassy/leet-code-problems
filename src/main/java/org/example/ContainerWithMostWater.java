package org.example;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mov, max = 0;
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            if(area > max){
                max = area;
                continue;
            }
            if(height[left] > height[right]){
                mov = 0;
                while(left < right + mov && height[right] >= height[right + mov])mov--;
                right += mov;
            }else{
                mov = 0;
                while(left  + mov< right && height[left] >= height[left + mov])mov++;
                left += mov;
            }
        }
        return max;
    }
}

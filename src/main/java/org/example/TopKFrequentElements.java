package org.example;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] nums = new int[]{3,0,1,0};
        int k = 1;
        Arrays.stream(topKFrequentElements.topKFrequent(nums, k)).forEach(System.out::println);
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.merge(nums[i], 1, Integer::sum);
        }
        List<Integer>[] freqArray = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer, Integer> set : frequencyMap.entrySet()){
            int frequency = set.getValue();
            int num = set.getKey();
            if(freqArray[frequency] == null)
                freqArray[frequency] = new ArrayList<>();
            freqArray[frequency].add(num);
        }
        int index = 0;
        int[] result = new int[k];
        for(int i = nums.length - 1; i >= 0; i--){
            if(freqArray[i] != null)
                for(int value : freqArray[i]){
                    result[index++] = value;
                    if(index == k)
                        return result;

                }
        }
        return result;
    }
}

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
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.merge(nums[i], 1, Integer::sum);
        }

        List<Integer> array[] = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(array[set.getValue()] == null)
                array[set.getValue()] = new ArrayList<>();
            array[set.getValue()].add(set.getKey());
        }
        int[] result = new int[k];
        int size = 0;
        for (int i = nums.length; i > 0; i--) {
            if(array[i] != null)
                for (int num: array[i]){
                    result[size++] = num;
                    if(size == k)
                        return result;
                }

        }
        return result;
//        PriorityQueue<Map.Entry<Integer, Integer>> minQueue = new PriorityQueue<>(k, (s1, s2) -> s1.getValue() - s2.getValue());
//        int size = 0;
//        for(Map.Entry<Integer, Integer> set : map.entrySet()){
//            if(size < k){
//                size++;
//                minQueue.add(set);
//            }else if(set.getValue() >= minQueue.peek().getValue()){
//                minQueue.poll();
//                minQueue.add(set);
//            }
//
//        }
//        int[] result = new int[k];
//        int i = 0;
//        while(!minQueue.isEmpty()){
//            result[i++] = minQueue.poll().getKey();
//        }
//        return result;
    }
}

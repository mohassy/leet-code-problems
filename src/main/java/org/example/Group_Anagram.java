package org.example;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Group_Anagram {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs).forEach(System.out::println);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            // compute key
            int [] hash = new int[26];
            for(char c : word.toCharArray()){
                hash[c - 'a']++;
            }
            // make key hash-map-friendly
            String key = Arrays.toString(hash);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }


}



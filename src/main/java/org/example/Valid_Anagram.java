package org.example;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Valid_Anagram {
    public static void main(String[] args) {
        test();
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] sArray = s.chars().sorted().toArray();
        int [] tArray = t.chars().sorted().toArray();

        for(int pivot = 0; pivot < t.length(); pivot++){
            if(sArray[pivot] != tArray[pivot])
                return false;
        }
        return true;
    }

    public static void test(){

    }
}

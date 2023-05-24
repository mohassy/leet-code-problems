package org.example;

import java.util.HashSet;
import java.util.StringTokenizer;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>(s.length());
        int start, count;
        start = count = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(charSet.contains(c))
                while(charSet.contains(c)){
                    char dup = s.charAt(start++);
                    charSet.remove(dup);
                }
            charSet.add(c);
            count = Math.max(count, right - start + 1);
        }
        return count;
    }
}

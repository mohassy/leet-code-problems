package org.example;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().replaceAll("[^a-z|^0-9]", "").toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j ; i++, j--) {
            if(charArray[i] != charArray[j])
                return false;
        }
        return true;
    }
}

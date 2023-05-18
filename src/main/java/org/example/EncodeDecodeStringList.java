package org.example;

import java.util.Iterator;
import java.util.List;

public class EncodeDecodeStringList {
    public static void main(String[] args) {
        EncodeDecodeStringList encodeDecodeStringList = new EncodeDecodeStringList();
        String[] strs = new String[]{"lint","code","love","you"};
        String encode = encodeDecodeStringList.encode(List.of(strs));
        System.out.println(encode);
        List<String> decode = encodeDecodeStringList.decode(encode);
        decode.iterator().forEachRemaining(System.out::println);

    }
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        String resultString = "";
        for (int i = 0; i < strs.size() - 1; i++) {
            resultString += strs.get(i) + ":;";
        }
        resultString += strs.get(strs.size()-1);
        return resultString;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        return List.of(str.split(":;"));
    }
}

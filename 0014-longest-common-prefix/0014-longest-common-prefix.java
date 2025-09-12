import java.util.List;
import java.util.ArrayList;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = strs[0];
        int prefixLength = prefix.length();
        for (int i = 0; i < prefixLength; i++) {
            char currentChar = prefix.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String currentString = strs[j];
                if (i >= currentString.length() || currentString.charAt(i) != currentChar) {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle edge case where the array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with each subsequent string
        for (int i = 1; i < strs.length; i++) {
            // While the current string does NOT start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by 1 character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If there is no common prefix at all, return early
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        String s2 = s.toLowerCase();
        
        // Remove all non-alphanumeric characters
        String s3 = s2.replaceAll("[^a-zA-Z0-9]", "");
        
        // Use two pointers to check if the string is a palindrome
        int left = 0;
        int right = s3.length() - 1;
        
        while (left < right) {
            if (s3.charAt(left) != s3.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // It's a palindrome
    }
}

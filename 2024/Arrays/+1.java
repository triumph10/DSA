class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and move towards the first
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  // Increment the current digit
                return digits; // Return the updated array
            }
            digits[i] = 0; // Set to 0 if the current digit is 9
        }
        
        // If all digits were 9, we need an additional leading 1
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // The first digit will be 1, the rest will be 0s
        return result;
    }
}

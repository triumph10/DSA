class Solution {
    public void moveZeroes(int[] nums) {
        int head = 0;  // This will point to where we should move the next non-zero element
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the 'head' position
            if (nums[i] != 0) {
                // Swap only if needed (to prevent unnecessary swaps when 'i' equals 'head')
                if (i != head) {
                    int temp = nums[head];
                    nums[head] = nums[i];
                    nums[i] = temp;
                }
                head++;  // Move the 'head' forward to place the next non-zero element
            }
        }
    }
}

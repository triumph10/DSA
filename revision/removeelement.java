class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to keep track of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the element at the k-th position
                k++; // Increment k to track the next position
            }
        }
        
        return k; // Return the count of elements not equal to val
    }
}

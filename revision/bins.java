class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = 0;
        int r = nums.length-1;
        while (f<=r) {
            int mid = (f+r)/2;
            if (nums[mid] < target) {
                f = mid +1;
            }
            else if (nums[mid] > target) {
                r =mid-1;
            }
            else {
                return mid;
            }

        } 
        return f;           
        
        
    }
}
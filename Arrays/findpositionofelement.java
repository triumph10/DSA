class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l =0;
        int r= nums.length-1;
        while ( l<= r) {
            if( nums[l] == target && nums[r] == target ) {
                return new int[] {l,r};
            }
            else if(nums[l] == target && nums[r] !=target) {
                r--;
            }
            else  {
                l++;
            }
        }
        return new int[] {-1,-1};

    }
}
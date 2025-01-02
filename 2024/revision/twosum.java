class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0; i<nums.length; i++) {
            for(j=i+1; j< nums.length; j++) {
                if( nums[i]+nums[j] == target) {
                return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] nums = {2,4,6,11};
        int target = 10;
        int[] result = solution.twoSum(nums,target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
}
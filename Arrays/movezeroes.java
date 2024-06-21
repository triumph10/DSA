//how i thought it should be
class Solution {
public void moveZeroes(int[] nums) {
for(int i=0; i< nums.length; i++) {
if(nums[i]==0) {
swap(nums[i],nums[i+1]);
}
else if(nums[i]==0 && nums[i+1]==0) {
swap(nums[i+2],nums[i]);
        }
    }
    
    
}
swap(int[] , int[]) {
        temp = a;
        a = b;
        b= temp;}
}


class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, lastNonZeroFoundAt, i);
                lastNonZeroFoundAt++;
            }
        }

        // After all non-zero elements are moved to the front,
        // the remaining positions should be filled with zeroes
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}


//leetcode soln understood entrie
class Solution {
    public void moveZeroes(int[] nums) {
        
        int p=0;
        
        for(int n : nums)
            if(n!=0)
                nums[p++]=n;
        
        while(p<nums.length)
            nums[p++]=0;
        
    }
}
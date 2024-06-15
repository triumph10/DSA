import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 6};
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}

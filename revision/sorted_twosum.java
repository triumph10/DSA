class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) { // Use a while loop to keep iterating as long as l is less than r
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                // Since the array is 1-indexed, add 1 to both indices
                return new int[] {l + 1, r + 1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        // The problem guarantees exactly one solution, so this line should never be reached
        return new int[] {-1, -1};
    }
}

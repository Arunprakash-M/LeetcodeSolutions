class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                max = nums[i]; 
            } else if (nums[i] > max) {
                max = nums[i];
            }

            int curr = max - min;
            if (curr > output) {
                output = curr;
            }
        }
        return output > 0 ? output : -1; 
    }
}

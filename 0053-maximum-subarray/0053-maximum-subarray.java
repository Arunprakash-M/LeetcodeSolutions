class Solution {
    public int maxSubArray(int[] nums) {
        long sum = 0, maxi = Long.MIN_VALUE;
        int answerStart = -1, answerEnd = -1, start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                answerStart = -1;
                answerEnd = -1;
            }
            
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                answerStart = start;
                answerEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        return (int) maxi;
    }
}

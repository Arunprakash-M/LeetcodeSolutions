class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]= new int[nums.length];
        int max=0;
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]>=dp[i]){
                    dp[i]=1+dp[j];
                }
            }           max=Math.max(dp[i],max);
                                       
        }
        return max;
    }
}
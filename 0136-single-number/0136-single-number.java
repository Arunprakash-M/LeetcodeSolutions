class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2){
            if(nums[i]==nums[i+1]){
                i +=2;
                continue;
            }
            else{
                break;
            }
        }
        return nums[i];
    }
}
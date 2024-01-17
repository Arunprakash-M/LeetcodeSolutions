public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (targetMap.containsKey(complement)) {
                return new int[]{targetMap.get(complement), i};
            }
            targetMap.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

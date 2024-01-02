class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arrey = new int[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            
            int val = ++arrey[nums[i]-1];
            if(ans.size()<val) ans.add(new ArrayList<>());
            ans.get(val-1).add(nums[i]);   
        } 
        return ans;
    }
}
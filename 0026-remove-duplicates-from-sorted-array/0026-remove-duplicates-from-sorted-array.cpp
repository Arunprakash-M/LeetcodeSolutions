class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
         int rd=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]!=nums[i-1])
                nums[rd++]=nums[i];
        }
        return rd;
    }
};
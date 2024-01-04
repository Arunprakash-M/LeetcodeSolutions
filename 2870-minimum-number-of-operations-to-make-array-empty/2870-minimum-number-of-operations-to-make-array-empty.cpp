class Solution {
public:
    int minOperations(vector<int>& nums) {
        map<int,int>m;
        for(auto &it:nums){
            m[it]++;
        }
        int count=0;
        for(auto &[f,s]:m){
            if(s==1)return -1;
            count+=s/3;
            if(s%3)count++;
        }return count;
    }
};
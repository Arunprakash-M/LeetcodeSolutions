class Solution {
    public int numberOfBeams(String[] bank) {
        int start=0,curr=0,ans=0;
        for(String s : bank){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '1'){
                    curr++;
                }
            }
            if(curr>0){
                ans += start * curr;
                start = curr;
                curr=0;
            }
        }
        return ans;
    }
}
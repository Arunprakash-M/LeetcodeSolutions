class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int a=0,b=0,n=g.size(),count=0;
        while(b<s.size() && count<=g.size() && a<n){
            if(g[a]<=s[b]){
                a++;
                b++;
                count++;
            }
            else{
                b++;
            }
        }
        return count;
    }
};
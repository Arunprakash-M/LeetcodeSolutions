class Solution {
public:
    bool isPalindrome(int x) {
        int n=x;
        if(x<0) return false;
        long long rev = 0;
        while(x>0){
            rev = (rev*10) + x%10;
            x=x/10;
        }
        if(rev == n) return true;
        return false;
        
    }
};
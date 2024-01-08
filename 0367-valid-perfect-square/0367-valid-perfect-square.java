class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        int Ans = (int) ans;
        if(Ans*Ans == num){
            return true;
        }
        return false;
    }
}
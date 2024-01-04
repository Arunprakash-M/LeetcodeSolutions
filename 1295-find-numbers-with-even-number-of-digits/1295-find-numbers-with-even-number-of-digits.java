class Solution {
    
    public boolean numberOfDigits(int n){
       // int temp=0;
       //  while(n>0){
       //      n=n/10;
       //      temp++;
       //  }
       //  return temp%2==0? true: false;
        
        if(n<10){
            return false;//digits 1
        }
        else if(n<100){
            return true;//digits 2
        }
        else if(n<1000){
            return false;//digits 3
        }
        else if(n<10000){
            return true;//digits 4
        }
        else if(n<100000){
            return false;//digits 5
        }
        return true;
    }
    
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int i=0;i<nums.length;i++){
            if(numberOfDigits(nums[i])){
                count++;
            }
        }
        return count;
    }
}
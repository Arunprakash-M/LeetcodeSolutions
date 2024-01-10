class Solution {
    public boolean checkString(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                c++;
            }
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
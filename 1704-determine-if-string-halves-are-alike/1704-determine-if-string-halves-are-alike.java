class Solution {
    public boolean halvesAreAlike(String s) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||s.charAt(i)=='A' || s.charAt(i) =='E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'  ){
                c1++;
            }
        }
         for(int j=s.length()/2;j<s.length();j++){
            if(s.charAt(j)=='a' || s.charAt(j) =='e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u' ||s.charAt(j)=='A' || s.charAt(j) =='E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U' ){
                c2++;
            }
         }
             if(c1==c2){
                 return true;
             }
             return false;
    }
}
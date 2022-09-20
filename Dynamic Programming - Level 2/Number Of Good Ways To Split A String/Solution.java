class Solution {
    public int numSplits(String s) {
       int n= s.length();
       int[] pre = new int [n];
       int[] suf = new int [n];
       int[] fre = new int [26];
       int count =0;
       for(int i=0; i < n; i++){
           int ch = s.charAt(i) - 'a';
           fre[ch]++;
           if(fre[ch] == 1){
               count++;
           }
           pre[i] = count;
       }

       fre = new int [26];
       count = 0;

       for(int i=n-1; i >= 0; i--){
           int ch = s.charAt(i) - 'a';
           fre[ch]++;
           if(fre[ch] == 1){
               count++;
           }
           suf[i] = count;
       }

        int splits = 0;

       for(int i=0; i < n-1; i++){
           if(pre[i] == suf[i+1]){
               splits++;
           }
       }
       
       return splits;
    }
}

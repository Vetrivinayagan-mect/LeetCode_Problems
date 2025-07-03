class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder();
        str.append('a');
        while(str.length()<k){
            int n =str.length();
              for(int i=0;i<n;i++){
                char current = str.charAt(i);
                if(current=='z') str.append('a');
                else{
                    str.append((char)(current+1));
                }
                if(str.length()>=k) break;
              }  
        }
        return str.charAt(k-1);
    }
}

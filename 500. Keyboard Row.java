class Solution {
    public String[] findWords(String[] words) {
        List<String> str = new ArrayList<>();
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        int count=0;
        int a=0;
        int b=0;
        int c=0;
        for(String word:words){
            a=0;
            b=0;
            c=0;
            String lower = word.toLowerCase(); 
            for (char ch : lower.toCharArray()) {
                if(str1.indexOf(ch)!=-1) a++;
                else if(str2.indexOf(ch)!=-1) b++;
                else if(str3.indexOf(ch)!=-1) c++;
            }
            int n = word.length();
            if(a==n||b==n||c==n){
                str.add(word);
            }
        }
        return str.toArray(new String[0]);
    }
}

class Solution {
    public void check(int index,int prev,String[] words,int[] groups,List<String> ans){
        if(index==words.length) return;
        if(groups[index]!=prev) ans.add(words[index]);
        check(index+1,groups[index],words,groups,ans);
        return;
    }
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        check(0,-1,words,groups,ans);
        return ans;
    }
}

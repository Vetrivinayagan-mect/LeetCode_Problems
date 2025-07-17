class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer>res = new HashSet<>();
        int candytype = 0 ;
        for(int n : candyType){
            if(!res.contains(n)) {
                candytype++;
                res.add(n);
            }
        }
        int allowed = candyType.length / 2;
        return Math.min(candytype , allowed); 
        

    }
}

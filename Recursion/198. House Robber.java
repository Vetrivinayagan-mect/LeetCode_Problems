class Solution {
    public int func(int i,int[] nums,int[] dp){
        if(i==0) return nums[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i]; 
        int pick =nums[i]+func(i-2,nums,dp);
        int nonPick=0+func(i-1,nums,dp);

        return dp[i] = Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
    }
}

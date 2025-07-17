class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int maxi =Integer.MIN_VALUE;
        
        for(int num:nums){
            int curr=num%k;
            for(int i=0;i<k;i++){
                dp[i][curr]=dp[curr][i]+1;
                maxi = Math.max(maxi,dp[i][curr]);
            }
        }
        return maxi;
    }
}

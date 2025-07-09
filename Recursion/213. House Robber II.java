class Solution {
    public int func(int i,int[] dp,ArrayList<Integer> nums){
        if(i==0) return nums.get(i);
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=nums.get(i)+func(i-2,dp,nums);
        int nonPick=0+func(i-1,dp,nums);
        return dp[i]=Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            arr1.add(nums[i]);
            arr2.add(nums[i+1]);
        }
        int[] dp = new int[n-1];
        Arrays.fill(dp,-1);
        int min1=func(n-2,dp,arr1);
        Arrays.fill(dp,-1);
        int min2=func(n-2,dp,arr2);
        return Math.max(min1,min2);
    }
}

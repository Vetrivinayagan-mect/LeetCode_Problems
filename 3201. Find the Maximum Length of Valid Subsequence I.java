class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        int odd=0;
        int even=0;
        int oddeven=0;
        int parity=nums[0]%2==0?0:1;
        int oldParity = parity==0?1:0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) even++;
            if(nums[i]%2==1) odd++;
            parity=nums[i]%2==0?0:1;
            if(parity!=oldParity){
                oddeven++;
                oldParity=parity;
            }

        }
        return Math.max((Math.max(even,odd)),oddeven);
    }
}

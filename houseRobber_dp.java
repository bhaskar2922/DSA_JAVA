class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int ans1=r(nums,1,nums.length-1);
        int ans2=r(nums,0,nums.length-2);
        return Math.max(ans1,ans2);
        
    }
    public static int r(int [] a,int s,int e)
    {
           int dp[]=new int[e-s+1];
           dp[0]=a[s];
           if(e-s+1>1)
           dp[1]=Math.max(a[s],a[s+1]);
           for(int i=2;i<dp.length;i++)
           {
              dp[i]=Math.max(dp[i-1],dp[i-2]+a[s+i]);
           }
           return dp[dp.length-1];
    }
}

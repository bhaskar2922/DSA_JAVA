class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
           rev(nums,0,n-1);return;
        }
        for(int i=n-1;i>idx;i--)
        {
            if(nums[i]>nums[idx])
            {
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;break;
            }
        }
        rev(nums,idx+1,n-1);
        
    }
    public static void rev(int a[],int s,int e)
    {
        while(s<e)
        {
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;e--;
        }
    }
}

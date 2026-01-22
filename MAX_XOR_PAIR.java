class Solution {
      static class TrieNode
      {
         TrieNode child[]=new TrieNode[2];
      }
      TrieNode root = new TrieNode();
      int max=0; 
    public int findMaximumXOR(int[] nums) {
        for(int n:nums)
        {
            insert(n);
        }
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,mxr(nums[i]));
        }
        return max;
        
    }
    public void insert(int num)
    {  
        TrieNode node=root;
        for(int i=31;i>=0;i--)
        {   int bit=0;
            if((num>>i&1)!=0)
              bit=1;
            if(node.child[bit]==null)  
                node.child[bit]=new TrieNode();
            node=node.child[bit];      
        }
    }
    public  int mxr(int num)
    {   int ans=0;
        TrieNode node=root;
        for(int i=31;i>=0;i--)
        {
            int bit=(num>>i)&1;
            int op=1-bit;
            if(node.child[op]!=null)
            {
                ans+=(1<<i);
                node=node.child[op];
            }
            else
             node=node.child[bit];
        }
        return ans;
    }

}

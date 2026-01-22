class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>st=new HashSet<>(wordDict);
        Boolean dp[]=new Boolean [s.length()];
        int maxl=0;
        for(String w:wordDict)
        {
            maxl=Math.max(maxl,w.length());
        }
       return (wb(s,0,st,dp,maxl));
        
    }
    public static boolean  wb(String s,int idx,Set<String>st,Boolean dp[],int maxl)
    {
        if(idx==s.length())return true;
        if(dp[idx]!= null)return true;
        for(int i=idx;i<s.length()&&i+1-idx<=maxl;i++)
        {
           String  sub=s.substring(idx,i+1);
            if(st.contains(sub))
            {
                if(wb(s,i+1,st,dp,maxl))
                 return dp[idx]=true;
            }
        }
        return false;
    }
}

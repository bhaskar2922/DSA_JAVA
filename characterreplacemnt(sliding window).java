class Solution {
    public int characterReplacement(String s, int k) {
        
        int ans=0;
        for(int i=0;i<26;i++)
        {
            int p1=0,p2=0,c=0;
            while(p2<s.length())
            {
                char ch=s.charAt(p2);
                if(ch==i+'A')p2++;
                else if(c<k){
                   p2++;
                   c++;
                }
                else if(s.charAt(p1)==i+'A')p1++;
                else{
                    
                    c--;
                    p1++;
                }
                ans=Math.max(ans,p2-p1);
            }
        }
        return ans;
        
    }
}

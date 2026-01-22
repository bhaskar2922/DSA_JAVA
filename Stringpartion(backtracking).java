class Solution {
    public List<List<String>> partition(String s) {
        List<String>al=new ArrayList<>();
        List<List<String>>res=new ArrayList<>();
        spp(s,0,al,res);
        return res;
        
    }
    public void spp(String s,int idx,List<String>al,List<List<String>>res)
    {   
        if(idx==s.length())
        {
            res.add(new ArrayList<>(al));
            return;
        }
        
        for(int i=idx;i<s.length();i++)
        {
            if(checkp(s,idx,i)){
             al.add(s.substring(idx,i+1));
            spp(s,i+1,al,res);
             al.remove(al.size()-1); 
            }
        }
    }
    public boolean checkp(String s,int st,int e)
    {
        while(st<e)
        {
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;e--;
        }
        return true;
    }
}

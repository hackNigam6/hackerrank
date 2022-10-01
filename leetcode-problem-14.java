class Solution {
    public String longestCommonPrefix(String[] strs) {
        Set<Character> s = new HashSet<>();
        
        String res = "";
        boolean flag = true;
        int i = 0;
        if(strs.length == 0)return res;
        
        char temp;
        while(flag)
        {
            try{
                temp = strs[0].charAt(i);
                for(int j=1; j<strs.length; j++)
                {
                    if(strs[j].charAt(i)!=temp){flag=false; break;}
                }
             }
            catch(Exception e){return res;}
            
            if(flag == true){res+=temp;}
            i++;
        }
        
        return res;
        
    }
}

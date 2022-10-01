class Solution {
    public int reverse(int x) {
        
        if (x ==0)return 0;
        boolean check = false;
        if(x<0){x = 0-x; check=true;}
        String s = Integer.toString(x);
        StringBuilder res = new StringBuilder(s);
        res.reverse();
        
        int i=0;
        while(i<res.length() && (res.charAt(i)=='0'))
        {
            res.deleteCharAt(i);
        }
        
        int re;
        try
        {
            re = Integer.parseInt(res.toString());    
        }
        catch(Exception e)
        {
            return 0;
        }
        
        if(check){re = 0-re;}
        return re;
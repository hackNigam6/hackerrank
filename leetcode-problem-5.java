class Solution {
    public:  
      
        string longestPalindrome (string s) 
        {
            string res;
    
            for (int i=0; i<s.size(); i++) {
                string s1=expandAroundCentre (s, i, i);
                string s2=expandAroundCentre (s, i, i+1);
                if (s1.length() > res.length()) res = s1;
                if (s2.length() > res.length()) res = s2;
            }
            return res;
        }
        
        string expandAroundCentre (string s, int i, int j) 
        {
             while (i>=0 && j<s.size() && s[i]==s[j]) {
                i--; j++;
            }
            return s.substr (i+1, j-i-1);
        }
        
        
    };
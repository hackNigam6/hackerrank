class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        
        vector<vector<int>> res;
        if(nums.size()>=3)
        {
            for(int k = 0; k<nums.size()-2; k++)
        {
            
            
            if(k==0 || (nums[k]!=nums[k-1]))
            {
                int i = k+1;
                int j = nums.size()-1;
                while(i<j)
                {
                    vector<int> v;
                    if(nums[i] + nums[j] == -nums[k])
                    {

                        v.push_back(nums[k]);
                        v.push_back(nums[i]);
                        v.push_back(nums[j]);
                        res.push_back(v);
                        while(i<j && nums[i]==nums[i+1])i++;
                        while(i<j && nums[j]==nums[j-1])j--;
                        
                        i++;j--;
                        
                    }else if(nums[i]+nums[j]<-nums[k]){
                        i++;
                    }else{
                        j--;
                    }
                }
                
            }
            
            
        }
            
        }
        
        
        
      
        
        return res;
        
    }
};
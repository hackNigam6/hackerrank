class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() == 0)
        {
            return 0;
        }
        
        for(int i=0; i< nums.size()-1; i++)
        {
            int j = i+1;
            while(nums[i]==nums[j] &&j<nums.size())
            {
                nums.erase(nums.begin()+j);
                // j ++; (mistake)
                j = i+1; //correction
            }
            
        }
        
        return nums.size();
    }
    
};
class Solution {
public:
    int maxArea(vector<int>& height) {
        
        int area = 0;
        
        int a = 0;
        int b = height.size()-1;
            
        while(a<b)
        {
            if(height[a]<height[b])
            {
                area = max(area, min(height[a], height[b])*(b-a));
                a++;
            }
            else
            {
                area = max(area, min(height[a], height[b])*(b-a));
                b--;
            }
            
        }
        
        return area;
    }
};
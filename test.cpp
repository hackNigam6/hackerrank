#include<bits/stdc++.h>
using namespace std;

vector<int> removeDuplicate(vector<int> nums)
{
    unordered_set<int> s;
	vector <int> v;
 
    for (int i = 0; i < nums.size(); i++)
        s.insert(nums[i]);

	copy(s.begin(),s.end(),v.begin());
	return v;
}

int main()
{
	vector<int> v={1,1,2,2,3,3,4,4,5,5};
	vector<int> v1=removeDuplicate(v);
	for(int i=0;i<v1.size();i++)
	{
		cout<<v1[i]<<" ";
	}
	return 0;
}
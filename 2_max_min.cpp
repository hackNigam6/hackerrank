#include<bits/stdc++.h>
using namespace std;

int max_min(int arr[], int n)
{
    int min=arr[0],max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=max)
        {
            max = arr[i];
        }
        if(arr[i]<=min)
        {
            min = arr[i];
        }
    }
    cout<<max<<" "<<min;
}

int main()
{
    int arr[] = {7,6,7,8,1,8,3,5,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    max_min(arr,n);
    return 0;
}
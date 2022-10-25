#include<bits/stdc++.h>
using namespace std;

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void kth(int arr[], int n,int k)
{
    int temp;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[i])
            {
                swap(&arr[j],&arr[i]);
            }
        }
    }
    cout<<arr[k-1];
    for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
}

int main()
{
    int k,x;
    cin>>x>>k;
    int arr[x];
    for(int i=0;i<x;i++)
    cin>>arr[i];
    // int n=sizeof(arr)/sizeof(arr[0]);
    kth(arr,x,k);
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

bool search(int arr[],int i,int j,int sum)
{
    for(int i=0;)

}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
     int sum =  0;
     int count = 0;
     
    for(int i=0;i<n;i++)
    {      sum = 0;  
        for(int j=i;j<n;j++)
        {
            sum = sum+arr[j];
        }
    }



    return 0;
}
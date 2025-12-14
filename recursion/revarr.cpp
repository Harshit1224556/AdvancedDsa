#include <bits/stdc++.h>
using namespace std;

void reversearr(int arr[],int l,int r){
      if(l>=r) return;
     swap(arr[l],arr[r]);
      reversearr(arr,l+1,r-1);
    
}

void printarr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }
}
int main()
{
 
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    reversearr(arr,0,n-1);
    printarr(arr,n);
    return 0;
}
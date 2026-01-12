//here the brute force solution failed so we came here
//to solve the we have to use o(n) complexity 
#include <bits/stdc++.h>
using namespace std;
int main()
{
  
     int n;
     cin>>n;
     int arr[n];
     for(int i=0;i<n;i++){
        cin>>arr[i];
     }
     
     int prefixsum = 0;
     int suffixsum[n];
     suffixsum[n-1] = arr[n-1];
     int mins = INT_MAX;
     for(int i=n-2;i>=0;i--){
        suffixsum[i] = min(arr[i+1],suffixsum[i+1]);
      
     }

     

      int maxs = INT_MIN;
      for(int i=0;i<n;i++){
        prefixsum+=arr[i];
        int diff = prefixsum-suffixsum[i];
        if(diff>maxs) maxs = diff;
      }
    
      cout << maxs;
    return 0;
}

//10 -1 3 -4 -5

//-5 -5 -5 -5 -5

//-7 -5 3
//-5 3 3


// -7 -5 3
//-5 3  3
//   -5  3 3


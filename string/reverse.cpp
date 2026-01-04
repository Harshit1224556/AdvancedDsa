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


 

int reversearr[n];

int ind = 0;
for(int i=n-1;i>=0;i--){
    reversearr[ind] = arr[i];
    ind++;
}

for(int i=0;i<n;i++){
    cout << reversearr[i];
}
    return 0;
}
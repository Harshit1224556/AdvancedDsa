#include <bits/stdc++.h>
using namespace std;


void printsubset(vector<int>&arr,vector<int> temp,int ind){

    if(ind==arr.size()){
        for(int i=0;i<temp.size();i++){
            cout << temp[i] << " ";
        }

        cout << endl;

        return;
    }
    while()
    temp.push_back(arr[ind]);
    printsubset(arr,temp,ind+1);
    temp.pop_back();
      printsubset(arr,temp,ind+1);

}
int main()
{

     int n;
     cin>>n;
     vector<int> arr(n);
     for(int i=0;i<n;i++){
        cin>>arr[i];
     }

     sort(arr.begin(),arr.end());
     vector<int> temp;

     printsubset(arr,temp,0);

    return 0;
}
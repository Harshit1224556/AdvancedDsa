#include <bits/stdc++.h>
using namespace std;

void print(vector<int>&ds,int ind,int arr[],int n){
    if(ind>=n){
        for(auto it:ds){
            cout << it << " ";
            
        }

        if(ds.size()==0){
            cout << "{}";
            
        }
        cout << endl;
        
        return;
    }

        ds.push_back(arr[ind]);
        print(ds,ind+1,arr,n);
        ds.pop_back();
        print(ds,ind+1,arr,n);

    
}
int main()
{

    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    vector <int> ds;
    print(ds,0,arr,n);

    return 0;
}
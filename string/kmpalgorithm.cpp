#include <bits/stdc++.h>
using namespace std;
int main(){

string s;
cin>>s;
int first = 0;
int second = 1;
int n  = s.size();
vector<int> lps(n,0);
while(second<n){

     if(s[first]==s[second]){
          first++;
          lps[second] = first;
          second++;
     }
    else{
        if(first>0){
           first = lps[first-1];
        }
        else{
            second++;
        }
    }
}

cout << s.substr(0,lps[n-1]);
    return 0;
}




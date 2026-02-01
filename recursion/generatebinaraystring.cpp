#include <bits/stdc++.h>
using namespace std;

bool isnotadjacent(string s){
  int countzero = 0;
    for(int i=0;i<s.length();i++){
         
         if(s[i]=='0') countzero++;
         else countzero = 0;

         if(countzero>1) return false;
    }
    return true;
}


void solve(string s,int n,vector<string> &res){
     
    if(s.length()==n){

        if(isnotadjacent(s)){
          
          res.push_back(s);
        }

        return;
    }

    solve(s+"0",n,res);
    solve(s+"1",n,res);
}

int main()
{

 

    int n;
    cin>>n;

    vector<string> res;

    solve("",n,res);

    for(int i=0;i<res.size();i++){
        cout<<res[i] << endl;
    }
    return 0;
}
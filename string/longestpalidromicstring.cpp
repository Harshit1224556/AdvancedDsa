#include <bits/stdc++.h>
using namespace std;
 bool  duplicate(string s){
        map<char,int> mpp;
        for(int i=0;i<s.length();i++){
            mpp[s[i]]++;
        }

        for(auto it:mpp){
            if(it.second>1) return false;
        }

        return true;
     }

int main()
{


string s;
cin>>s;
 cout << duplicate(s);










    return 0;
}




//access modifier


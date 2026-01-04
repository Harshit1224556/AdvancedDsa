#include <bits/stdc++.h>
using namespace std;

// bool ispalindrome(string s,int st,int ed){
//       if(st>=ed) return true;
//       if(s[st]!=s[ed]) return false;
//        return ispalindrome(s,st+1,ed-1);
// }


bool ispalindrome(int i,string s){
    int n = s.length();
    if(i>=(n/2)) return true;
    if(s[i]!=s[n-i-1]) return false;
    return ispalindrome(i+1,s);
}

int main()
{

     string s;
     cin>>s;
     int n = s.length();
     cout << ispalindrome(0,s);
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

bool ispalindrome(string s,int st,int ed){
      if(st>=ed) return true;
      if(s[st]!=s[ed]) return false;
       return ispalindrome(s,st+1,ed-1);
}
int main()
{

     string s;
     cin>>s;
     int n = s.length();
     cout << ispalindrome(s,0,n-1);
    return 0;
}
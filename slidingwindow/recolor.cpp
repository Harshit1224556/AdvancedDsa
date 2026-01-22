#include <bits/stdc++.h>
using namespace std;
int main()
{
 
    string s;
    cin>>s;
    int k;
    cin>>k;
    int start = 0;
    int end = 0;
    int cw = 0;
    int cb = 0;
    int mins  = INT_MAX;
    while(end<s.length())
   {
      if(s[end]=='w') cw++;
      else cb++;

      

       if(cb+cw>k){
       
        if(s[start]=='w') cw--;
        else cb--;
         start++;
      }
    else if( cb+cw==k){
         mins = min(mins,cw);
      }

      end++;
   }

   cout << mins;
    return 0;
}
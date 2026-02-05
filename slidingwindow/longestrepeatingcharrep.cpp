#include <bits/stdc++.h>
using namespace std;
int main()
{

    string s;
    cin>>s;
    int k;
    cin>>k;
    int left = 0;
    int right = 0;
    int maxlen = INT_MIN;
    while(right<s.length()-1){
        if(s[right+1]!=s[right]){
            k--;
        }
          
        if(k<0){
           k++;
            left++;
        }
        maxlen = max(maxlen,right-left+1);
        right++;
       
    }

    cout << maxlen;
    return 0;

}
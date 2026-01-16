#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int count = 0;
    int n = s.length();
        string sleft = "";
        string sright = "";
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                sleft+=s[j];
            }

            for(int k=i+1;k<n;k++){
                sright+=s[k];
            }

            set<char> st1;
            set<char> st2;
            for(int p=0;p<sleft.length();p++){
                 st1.insert(sleft[p]);
            }

            for(int z=0;z<sright.length();z++){
                 st2.insert(sright[z]);
            }

            if(st1.size()==st2.size()) count++;

            sleft="";
            sright="";
            
        }

        cout << count;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int  sum(int i,int n,int s){
    
    if(i>n) return s;
    s = s + i;
    sum(i+1,n,s);
   
}
int main()
{
  
    int n;
    cin>>n;
    cout<<sum(1,n,0);

    return 0;
}
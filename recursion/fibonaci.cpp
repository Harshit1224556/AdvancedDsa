#include <bits/stdc++.h>
using namespace std;
int fibonicci(int n){
    if(n<=1) return n;
    return fibonicci(n-1)+ fibonicci(n-2);
}
int main()
{
   int n;
   cin>>n;
   
    cout << fibonicci(n);



    return 0;
}
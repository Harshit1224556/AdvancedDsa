#include <bits/stdc++.h>
using namespace std;

void printinseries(int n){
      if(n==0) return;
      cout << n << endl;
      printinseries(n-1);
}


int main()
{
int n;
cin>>n;
printinseries(n);
    return 0;
}
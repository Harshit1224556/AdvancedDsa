#include <bits/stdc++.h>
using namespace std;

bool isbalanced(string s){
    int balance = 0;
    for(char ch:s){
        if(ch=='(') balance++;
        else if(ch==')') balance--;
        if(balance<0) return false;
    }
    return balance==0;
}


int main()
{

    string s;
    cin >> s;
    cout << isbalanced(s);

    return 0;
}
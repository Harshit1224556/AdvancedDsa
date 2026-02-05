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
            for(int i=0;i<sleft.length();i++){
                 st1.insert(sleft[i]);
            }
            for(int i=0;i<sright.length();i++){
                 st2.insert(sright[i]);
            }

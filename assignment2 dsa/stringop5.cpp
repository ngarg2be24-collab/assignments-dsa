#include <iostream>
#include <string>
using namespace std;
int main(){
    string str;
    cout<<"Enter a string having uppercase letters";
    cin>>str;
    for(int i=0;i<str.length();i++){
        str[i]=(int)str[i]+32;
    }

    cout<<str;
}
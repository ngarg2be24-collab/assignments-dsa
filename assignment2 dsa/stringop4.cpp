#include <iostream>
#include <string>
using namespace std;
int main(){
    cout<<"Enter a string in lowercase ";
    string str;
    cin>>str;
    for(int i=1;i<=str.length()-1;i++){
        for(int j=0;j<=str.length()-i-1;j++){
            if(str[j]-'a'>str[j+1]-'a'){
                swap(str[j],str[j+1]);
            }
        }
    }
    cout<<str;

}
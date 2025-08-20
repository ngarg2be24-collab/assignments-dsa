#include <iostream>
#include <string>
using namespace std;
int main(){
    string str;
    cout<<"Enter a string";
    cin>>str;
    int i=0;
    while(i<str.length()){
        if((str.at(i)=='a')||(str.at(i)=='e')||(str.at(i)=='i')||(str.at(i)=='o')||(str.at(i)=='u')){
             str.erase(i,1);
        }
        else{
        i++;
        }
    }
    cout<<str;
}
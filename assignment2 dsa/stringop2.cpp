#include <iostream>
#include <string>
using namespace std;
int main(){
    string str;
    cout<<"Enter a string";
    getline(cin,str);
    //2 pointer approach
    int start=0;
    int end=str.length()-1;
    while(start<end){
        int temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
    }
    cout<<str;
    
}
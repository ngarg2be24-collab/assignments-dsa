#include<iostream>
#include <set>
using namespace std;
int main(){

    int n;
    cout<<"Enter the number of elements in the array";
    cin>>n;
     int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    set<int> s;
    for(int i=0;i<n;i++){
        s.insert(arr[i]);
    }
    int count=0;
    for(int x : s){
       count++;
    }
    cout<<"total number of distinct elements : "<<count;
}
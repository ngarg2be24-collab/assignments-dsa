#include <iostream>
using namespace std;
int main(){
    cout<<"enter the number of rows and cols";
    int n;
    cin>>n;
    int size=(n*(n+1))/2;
    int tridiag[size];
    cout<<"Enter the n(n+1)/2 elements of matrix ";
    for(int i=0;i<(size);i++){
        cin>>tridiag[i];
    }

    int k=1;
    int sparsematrix[size+1][3];
    sparsematrix[0][0]=n;
    sparsematrix[0][1]=n;
    sparsematrix[0][2]=size;
    int ind=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(i>=j){
            sparsematrix[k][0]=i;
            sparsematrix[k][1]=j;
            sparsematrix[k][2]=tridiag[ind++];
            k++;
          }
        }
    }
    for(int i=0;i<size+1;i++){
        for(int j=0;j<3;j++){
           cout<<sparsematrix[i][j]<<" ";
        }
        cout<<endl;
    }
}
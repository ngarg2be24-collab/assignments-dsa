#include <iostream>
using namespace std;
int main(){
    cout<<"enter the number of rows and cols";
    int n;
    cin>>n;
    int tridiag[3*n-2];
    cout<<"Enter the 3n-2 elements of matrix ";
    for(int i=0;i<(3*n-2);i++){
        cin>>tridiag[i];
    }

    int k=1;
    int sparsematrix[3*n-1][3];
    sparsematrix[0][0]=n;
    sparsematrix[0][1]=n;
    sparsematrix[0][2]=3*n-2;
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(i==j){
            sparsematrix[k][0]=i;
            sparsematrix[k][1]=j;
            sparsematrix[k][2]=tridiag[i];
            k++;
          }

          else if(j-i==1){
            sparsematrix[k][0]=i;
            sparsematrix[k][1]=j;
            sparsematrix[k][2]=tridiag[n+i];
            k++;
          }
          else{
            sparsematrix[k][0]=i;
            sparsematrix[k][1]=j;
            sparsematrix[k][2]=tridiag[2*n-1+j];
            k++;
          }
        }
    }
    for(int i=0;i<3*n-1;i++){
        for(int j=0;j<3;j++){
           cout<<sparsematrix[i][j]<<" ";
        }
        cout<<endl;
    }
}
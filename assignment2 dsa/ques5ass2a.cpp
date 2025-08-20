#include <iostream>
using namespace std;
int main(){
    cout<<"Enter the number of diagonal elements";
    int n;
    cin>>n;
    int diag[n];
     cout<<"Enter the non zero diagonal elements of diagonal matrix";
    for(int i=0;i<n;i++){
        cin>>diag[i];
    }
    int k=1;
    int sparsematrix[n+1][3];
    sparsematrix[0][0]=n;
    sparsematrix[0][1]=n;
    sparsematrix[0][2]=n;
    for(int i=0;i<n;i++){
        {
               sparsematrix[k][0]=i;
               sparsematrix[k][1]=i;
               sparsematrix[k][2]=diag[i];
               k++;
        }
    }
    for(int i=0;i<n+1;i++){
        for(int j=0;j<3;j++){
            cout<<sparsematrix[i][j]<<" ";
        }
        cout<<endl;
    }
   
    
}
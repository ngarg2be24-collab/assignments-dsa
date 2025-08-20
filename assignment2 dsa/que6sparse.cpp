#include <iostream>
using namespace std;
int main(){
    int row1;
    int col1;
    int n1;
    cout<<"Enter the number of rows and cols in matrix 1";
    cin>>row1>>col1;
    cout<<"Enter the number of non zero values";
    cin>>n1;


    int A[50][3];
    cout<<"Enter the row col and non zero value for matrix A";
    for(int i=0;i<n1;i++){
        cin>>A[i][0]>>A[i][1]>>A[i][2];
    }
    
    int row2,col2,n2;
    cout<<"Enter the number of rows and cols in matrix 2";
    cin>>row2>>col2;
    cout<<"Enter the number of non zero values";
    cin>>n2;


    int B[50][3];
    cout<<"Enter the row col and non zero value for matrix B";
    for(int i=0;i<n2;i++){
        cin>>B[i][0]>>B[i][1]>>B[i][2];
    }
   

    //TRANSPOSE

    int AT[50][3];
    for(int i=0;i<n1;i++){
        AT[i][0]=A[i][1];
        AT[i][1]=A[i][0];
        AT[i][2]=A[i][2];
    }

     for(int i=0;i<n1;i++){
        cout<<AT[i][0]<<" "<<AT[i][1]<<" "<<AT[i][2]<<"\n";
     }
    //ADDITION

    if(row1!=row2 || col1!=col2){
     cout<<"matrix addition not allowed";
       return 0;
    }
    int C[100][3]; // result matrix
    int i = 1, j = 1, k = 1;

    C[0][0] = A[0][0];
    C[0][1] = A[0][1];

    // merge like merge-sort
    while (i <= n1 && j <= n2) {
        if (A[i][0] < B[j][0] || (A[i][0] == B[j][0] && A[i][1] < B[j][1])) {
            C[k][0] = A[i][0];
            C[k][1] = A[i][1];
            C[k][2] = A[i][2];
            i++; k++;
        }
        else if (B[j][0] < A[i][0] || (B[j][0] == A[i][0] && B[j][1] < A[i][1])) {
            C[k][0] = B[j][0];
            C[k][1] = B[j][1];
            C[k][2] = B[j][2];
            j++; k++;
        }
        else { // same row & col
            int sum = A[i][2] + B[j][2];
            if (sum != 0) {
                C[k][0] = A[i][0];
                C[k][1] = A[i][1];
                C[k][2] = sum;
                k++;
            }
            i++; j++;
        }
    }

    // copy remaining entries
    while (i <= n1) {
        C[k][0] = A[i][0];
        C[k][1] = A[i][1];
        C[k][2] = A[i][2];
        i++; k++;
    }
    while (j <= n2) {
        C[k][0] = B[j][0];
        C[k][1] = B[j][1];
        C[k][2] = B[j][2];
        j++; k++;
    }

    C[0][2] = k - 1; // total non-zero count

    // Display Result
    cout << "Resultant Sparse Matrix (Triplet Form):" << endl;
    for (int p = 0; p <= C[0][2]; p++) {
        cout << C[p][0] << " " << C[p][1] << " " << C[p][2] << endl;
    }
  
    //multiplication
    if (A[0][1] != B[0][0]) {
        cout << "Matrix multiplication not possible!" << endl;
        return 0;
    }

     
    int temp[100][3]; // intermediate result
    int k = 0;

    for (int i = 1; i <= n1; i++) {
        for (int j = 1; j <= n2; j++) {
            if (A[i][1] == B[j][0]) { // column of A = row of B
                temp[k][0] = A[i][0];
                temp[k][1] = B[j][1];
                temp[k][2] = A[i][2] * B[j][2];
                k++;
            }
        }
    }

    //  Combine terms with same row & col
    int C[100][3];
    int count = 0;

    for (int i = 0; i < k; i++) {
        int row = temp[i][0];
        int col = temp[i][1];
        int value = temp[i][2];

        // check if already exists
        bool found = false;
        for (int j = 1; j <= count; j++) {
            if (C[j][0] == row && C[j][1] == col) {
                C[j][2] += value;
                found = true;
                break;
            }
        }
        if (!found) {
            count++;
            C[count][0] = row;
            C[count][1] = col;
            C[count][2] = value;
        }
    }

    C[0][0] = A[0][0];
    C[0][1] = B[0][1];
    C[0][2] = count;

    //  Print Result
    cout << "Resultant Sparse Matrix (Triplet Form):" << endl;
    for (int i = 0; i <= C[0][2]; i++) {
        cout << C[i][0] << " " << C[i][1] << " " << C[i][2] << endl;
    }

    return 0;
}


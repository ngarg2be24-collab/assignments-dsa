import java.util.*;
public class que4ass2part2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and col of first 2d array");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int[][] a=new int[row1][col1];
         
        //input the elemnets of first array
 
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the number of rows and col of second 2d array");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int[][] b=new int[row2][col2];
         
        //input the elemnets of second array
 
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j]=sc.nextInt();
            }
        }
         
    int[][] Multiplication=new int[row1][col2];
    if(col1!=row2){
        System.out.println("Multiplication not possible");
    }
    else{
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
               for(int k=0;k<col1;k++){
                    Multiplication[i][j]+=a[i][k]*b[k][j];
               }
            }
        }

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(Multiplication[i][j]+" ");
            }
            System.out.println();
        }
    }
    sc.close();
}
}

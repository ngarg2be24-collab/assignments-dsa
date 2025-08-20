import java.util.*;
public class que4ass2part3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 2d array i.e. no. of rows and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] array=new int[row][col];

        //input elements in array

        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
            array[i][j]=sc.nextInt();
           }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

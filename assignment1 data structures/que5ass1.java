import java .util.*;
public class que5ass1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no.of rows and columns of the 2d array");
         int row=sc.nextInt();
          int col=sc.nextInt();
          int[][] array=new int[row][col];
          //initialising the elements to the 2d array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              array[i][j]=sc.nextInt();
            }
        }
         
        //finding sum of the rows
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
              sum=sum+array[i][j];
            }
            System.out.println("The sum of "+(1+i)+" row = "+sum);
        }

        //finding sum of the columns
        for(int j=0;j<col;j++){
            int sum=0;               
            for(int i=0;i<row;i++){
              sum=sum+array[i][j];
            }
            System.out.println("The sum of "+(1+j)+" col = "+sum);
        }
sc.close();
    }
}

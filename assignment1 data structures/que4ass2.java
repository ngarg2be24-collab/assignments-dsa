import java.util.*;
public class que4ass2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}

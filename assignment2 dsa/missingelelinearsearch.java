import java.util.*;
public class missingelelinearsearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements without missing element ");
    int size=sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<size-1;i++){
        if(array[i+1]-array[i]!=1){
            System.out.println("Missing element is :"+(array[i]+1));
        }
    }
    sc.close();
    }
}

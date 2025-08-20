import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target=sc.nextInt();
        int start=0;
        int end=size-1;
        int flag=0;
         
        while(start<=end){
       int mid=(start+end)/2;
          if(array[mid]==target){
            System.out.println("element found at index="+mid);
            flag=1;
            break;
          }
          else if(array[mid]<target){
            start=mid+1;
          }
          else{
            end=mid-1;
          }
        }
        if(flag==0){
            System.out.println("Element not found");
        }

        sc.close();
    }
}

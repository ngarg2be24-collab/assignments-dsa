import java.util.*;
public class que2ass2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        int index=0;
        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[index]=arr[i];
                index++;
            }
        }
          for(int i=0;i<index;i++){
            System.out.println(arr[i]);
           }
           sc.close();
    }
}

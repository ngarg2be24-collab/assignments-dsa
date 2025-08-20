import java.util.*;
public class que1ass1 {


    public static int[] create(int n){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[20];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
     sc.close();
    return array;
}


public static void display(int n){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[20];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(array[i]);
    }
    sc.close();
}

public static void linearsearch(int n,int target){
     Scanner sc=new Scanner(System.in);
    int array[]=new int[20];
    int found=0;
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(array[i]==target){
       found=1;
        System.out.println(i);
      }
    }
    if(found==0){
      System.out.println("Element not found");
    }
sc.close();
}

public static void insert(int n,int element,int pos){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[20];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    n++;
    for(int i=n-1;i>=pos;i--){
        array[i]=array[i-1];
    }
    array[pos-1]=element;
    for(int i=0;i<n;i++){
        System.out.println(array[i]);
    }
    sc.close();
}

public static void delete(int n,int ele){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[20];
    int index=0;
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(array[i]==ele){
       index=i;
      }
    }
    for(int i=index;i<n-1;i++){
        array[i]=array[i+1];
    }
    n--;
    for(int i=0;i<n;i++){
        System.out.println(array[i]);
    }
    sc.close();
}

public static void exit(){
   System.out.println("Exiting the code");
}


    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size less than 20");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the operation to be performed-CREATE/DISPLAY/LINEAR SEARCH/INSERT/DELETE/EXIT");
        String operation=sc.nextLine();
        switch(operation){
            case "CREATE":
             create(n);
             break;

             case "DISPLAY":
             display(n);
             break;

             case "LINEAR SEARCH":
             { 
                System.out.println("Enter the element to be searched");
                int ele=sc.nextInt();
                linearsearch(n,ele);
             break;
            }
             
             case "INSERT":{
                System.out.println("Enter the element to be searched and its posn of insertion");
                int ele=sc.nextInt();
                int pos=sc.nextInt();
             insert(n,ele,pos);
             break;
             }
             case "DELETE":
             {
                System.out.println("Enter the element to be deleted");
                int ele=sc.nextInt();
              delete(n,ele);
             break;
             }

             case "EXIT":
             exit();
             break;

             default:
             System.out.println("Wrong operation entered");
             break;
        }
        
        
        sc.close();
    }
}

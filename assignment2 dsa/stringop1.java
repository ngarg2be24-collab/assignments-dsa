import java.util.*;
public class stringop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 string");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        //concatenation
        String str3=str1+str2;
        System.out.println(str3);


        sc.close();
    }
}

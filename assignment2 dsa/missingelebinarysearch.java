import java.util.*;

public class missingelebinarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array excluding the missing element");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the values of array (sorted, starting from 1)");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int start = 0;
        int end = size - 1;
        int missing = -1; // placeholder

        while (start <= end) {
            int mid = (start + end) / 2;

            // Expected value at index mid = mid+1
            if (array[mid] == mid + 1) {
                
                start = mid + 1;
            } else {
                // Missing element lies in left half
                missing = mid + 1;
                end = mid - 1;
            }
        }

        System.out.println("Missing element is: " + missing);

        sc.close();
    }
}
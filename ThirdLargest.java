import java.util.*;

class ThirdLargestEx {
    int thirdLargest(int[] arr, int n) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst();   
            }
        }

        
        if (set.size() < 3) {
            System.out.println("Third largest element does not exist!");
            return -1;  
        }

        return set.first();  
    }
}

public class ThirdLargest {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ThirdLargestEx ob = new ThirdLargestEx();
        int third = ob.thirdLargest(arr, n);

        if (third != -1) {
            System.out.println("Third Largest Element = " + third);
        }

        sc.close();
    }
}

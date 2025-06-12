
import java.util.Scanner;public class Arr4 {
                         public static void main(String[] abc)
                         {
                            int [] arr=new int[5];

                            Scanner sc=new Scanner(System.in);

                            for(int i=0;i<arr.length;i++)
                            {
                                arr[i]=sc.nextInt();
                            }

                            int sum=0;
                         for(int i=0;i<arr.length;i++)
                         {
                             sum=sum+arr[i];
                         }
    System.out.println("Addition of Array Elments ="+sum);

                         }
                         
}

/*    output = 11
23
-11
2
10
Addition of Array Elments =35 */

import java.util.Scanner;
public class Arr2 {

    public static void main(String[]abc)
    {
       int []arr=new int[5];
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter array elements");

       for(int i=0;i<arr.length;i++)
       {
                         arr[i]=sc.nextInt();
       }

       int max=arr[0];

       for(int i=0;i<arr.length;i++)

       {
                         if(arr[i]>max)
                         {
                                                  max=arr[i];
                         }
       }
       System.out.println("Maximum element = "+max);
    }

                         
}

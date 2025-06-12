import java.util.Scanner;
public class Arr3 {

                         public static void main(String[]abc)
                         {
                             int [] arr=new int[5];
                             Scanner sc=new Scanner(System.in);

                             System.out.println("Enter Array elements");
                             for(int i=0;i<arr.length;i++)
                             {
                                 arr[i]=sc.nextInt();
                             }

                             System.out.println(" Sorted Array");
                             for(int i=0;i<arr.length;i++)
                             {
                                 for(int j=i+1;j<arr.length;j++)
                                 {
                                     if(arr[i]>arr[j])
                                     {
                                      int temp=arr[i];
                                      arr[i]=arr[j];
                                      arr[j]=temp;
                                     }
                                 }
                         }
    for(int i=0;i<arr.length;i++)
    {
                         System.out.print(arr[i]+"  ");
    }



                         }
                         
}


/*output=Enter Array elements
11
92 
-100
-34
21
 Sorted Array
-100  -34  11  21  92 */ 

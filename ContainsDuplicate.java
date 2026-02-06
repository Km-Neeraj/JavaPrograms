import java.util.*;
class Solution 
{
  static boolean iscontainsDup(int[]arr,int n)
  {
    HashSet<Integer> res=new HashSet<>();
     for(int num:arr)
     {
       if(res.contains(num))
        return true;
           res.add(num);
       
       
     }
     return false;
  }
}
public class ContainsDuplicate{
                         public static void main(String[] args) {
                                                  
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                     arr[i]=sc.nextInt();

                                                  }
                              boolean res=Solution.iscontainsDup(arr,n);
                              if(res)
                              {
                                   System.out.println("Array contains Duplicate elements");
                              }
                              else {
                                                  System.out.println("Array doesn't contains Duplicate elements");
                              }
                              sc.close();
                         }
                         
}

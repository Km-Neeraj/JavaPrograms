import java.util.*;
public class Practise51 {

                         public static void main(String[]abc)
                         {
                            int terms;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the terms till you print the prime numbers");
                            terms=sc.nextInt();

                            for(int i=2;i<=terms;i++)
                            {
                                                  int count=0;
                                                  for(int j=1;j<=i;j++)
                                                  {
                                                      if(i%j==0)
                                                      {
                                                        count++;
                                                      }
                                                  }
                                                  if(count==2)
                                                  {
                                                                           System.out.print(i+" ");
                                                  }
                            }
                         }
                         
}

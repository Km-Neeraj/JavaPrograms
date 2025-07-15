interface A 
{
                         boolean isEqual(int x,int y);
                         
}
public class LambdaExpEx3 {
                         public static void main(String[] abc)
                         {
                                                  A a=(x,y)->x==y;
                                                  boolean result=a.isEqual(5,5);
                                                  System.out.println(result);
                         }
                         
}
//true

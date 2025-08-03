//Lambda Expression 
interface Addition
{
   public void add();
}
public class Practice26 {
                         public static void main(String[]abc)
                         {
                             Addition a=()->{
                                                  int x=10,y=20;
                                                  int res=x+y;
                                                  System.out.println("sum = "+res);

                             };
                             a.add();
                         }
                         
}
//sum = 30
//WAP for nested try catch block
public class ExceptionEx11 {
                         public static void main(String[]abc)
                         {
                             try{
                                   int res=5/0;
                                   try{
                                         String s=null;
                                         s.length();
                                         try{
                                                  int[]arr=new int[2];
                                                  System.out.println("value at "+arr[5]);
                                         }catch(ArrayIndexOutOfBoundsException a)
                                         {
                                             System.err.println(a);
                                         }
                                   }catch(NullPointerException n)
                                   {
                                                  System.out.println(n);
                                   }
                                   
                             }catch(ArithmeticException e)
                             {
                                System.out.println(e);
                             }
                             finally{
                                       System.out.println("Nested try catch block");
                             }
                         }
                         
}

/*   java.lang.ArithmeticException: / by zero
     Nested try catch block */

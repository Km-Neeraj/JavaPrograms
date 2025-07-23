public class ExceptionEx6 {
public static void main(String abc[])
{
    try{
          System.out.println("A");
          throw new NullPointerException("Hello");
    }catch(ArithmeticException e)
    {
                         System.out.print("B");
    }
}
                         
}

/*  A
Exception in thread "main" java.lang.NullPointerException: Hello
at ExceptionEx6.main(ExceptionEx6.java:6) */

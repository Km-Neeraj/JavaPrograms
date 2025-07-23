public class ExceptionEx1 {
                         public static void main(String[]abc)
                         {
                                                  try{
                                                       System.out.println("Hello"+" "+1/0);

                                                  }
                                                  catch(ArithmeticException e)
                                                  {
                                                                           System.out.println("World");
                                                  }
                         }
                         
}

//World

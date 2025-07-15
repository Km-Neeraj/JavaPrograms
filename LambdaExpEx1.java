interface A 
{
                         String sayHello(String name);

                         
}
public class LambdaExpEx1 {
                         public static void main(String[]abc)
                         {
                                                  A a=name->"Hello"+name;
                                                  String greeting = a.sayHello("John");
                                                  System.out.println(greeting);
                         }
               //HelloJohn          
}

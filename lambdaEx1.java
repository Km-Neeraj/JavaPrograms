interface Abc{
                         void fun();
}
public class lambdaEx1 {

                         public static void main(String[] abc)
                         {
                            Abc a=()->
                            {
                                                  System.out.println("Welcome to the Functional Interface");
                            };
                            
                            a.fun();
                         }
                         
}


//output = Welcome to the Functional Interface.

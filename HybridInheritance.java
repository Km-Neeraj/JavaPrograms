class Main
{
      int x=100;
      int y=20;
      Main()
      {
           System.out.println("Main class Constructor");
           System.out.println("Sum ="+(x+y));              
      }
}
class A extends Main
{
     A() 
     {
        super();
        System.out.println("Child class a Constructor call");
        System.out.println("Multiplication ="+(x*y));
     }                     
}
class B extends Main{
        B()
        {
            super();
            System.out.println("Hybrid Inheritance Child class B Constructor call");
            System.out.println("Division ="+(x/y));
        }
}
class Joint extends A{
                         void print()
                         {
                             System.out.println("Substraction ="+(x-y));
                             System.out.println("Child class Joint method print invoke");
                         }                  
}
public class HybridInheritance {
                         public static void main(String[]abc)
                         {
                              Main m=new Main();
                              B b=new B();
                              Joint j=new Joint();
                              j.print();

                         }
}
/*     Main class Constructor
       Sum =120
       Main class Constructor
       Sum =120
       Hybrid Inheritance Child class B Constructor call
       Division =5
       Main class Constructor
       Sum =120
       Child class a Constructor call
       Multiplication =2000
       Substraction =80 */

class A 
{
    int x=10;
    void print()
    {
       System.out.println("Superclass Method invoke");
    }

   A()
   {
      System.out.println("SuperClass Constructor called");
   }
   {
      System.out.println("Initialize Block called");
   }
   static{
            System.out.println("SuperClass Static block execute");
   }
}

class B extends A
{
   int x=100;
   B()
   {
      System.out.println("Sub class Constructor invoke");
   }
   void print()
   {
     System.out.println("Subclass Print method");
     System.out.println("Value of Subclass x ="+x);
     System.out.println("Value of Superclass x ="+super.x);

   }
   static{
            System.out.println("Subclass Static Block Executed");
   }
   {
      System.out.println("Sub class Initialize block executed");
   }
}
    public class practice17 {
                         public static void main(String[]abc)
                         {
                            B ob=new B();
                            ob.print();

                         }


                         
}
/*   
SuperClass Static block execute
Subclass Static Block Executed
Initialize Block called
SuperClass Constructor called
Sub class Initialize block executed
Sub class Constructor invoke
Subclass Print method
Value of Subclass x =100
Value of Superclass x =10 */

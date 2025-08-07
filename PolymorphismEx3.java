
class A{
     public void m1()
     {
          System.out.println("Hello A");
     }
     public void m2()
     {
         System.out.println("Hii A");
     }

}
class B extends A
{
    public void m1()  //method overriding
    {
       System.out.println("Hello B");  
    }
}
                         
public class PolymorphismEx3 {
                         public static void main(String[]abc)
                         {
                             B ob=new B();
                             ob.m1();
                             ob.m2();
                         }
                         
}

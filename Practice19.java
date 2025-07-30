abstract class Abc{
                         
       void fun(int a) //non abstract method
       {
            System.out.println("Abstract class non Abstract method ");
           System.out.println("Value of a="+a);
       }
      abstract void fun();//abstract class 
      Abc()
      {
           System.out.println("Abstract class Constructor ");
      }
}
class Abc1 extends Abc{
       void fun()
       {
         System.out.println("Interface Abstract method overridden by subclass");
       }

       
}
public class Practice19 {
                         public static void main(String[]abc)
                         {
                            Abc ob=new Abc1();
                            ob.fun();
                            ob.fun(10);
                         }
                         
}
/*      
Abstract class Constructor 
Interface Abstract method overridden by subclass
Abstract class non Abstract method 
Value of a=10 */

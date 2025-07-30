interface Abc{
                 int x=200;
                 void fun(); //abstract method
}
interface Abc1{
                int y=20;
                void fun1();

}
class C implements Abc,Abc1{
                         int a=10,b=20;
                         public void fun()
                         {
                           System.out.println("Fun method invoke of interface Abc");
                         }
                         public void fun1()
                         {
                           System.out.println("Fun1 method invoke of interface Abc1");
                         }
}
class C1 extends C{
                         void print()
                         {
                            int res=a+b;
                            System.out.println("Addition of "+a+" "+b+" = "+res);
                         }
                      
}
public class Practice20 {
                         public static void main(String[]abc)
                         {
                             C1 ob=new C1();
                             ob.print();
                             ob.fun();
                             ob.fun1();
                         }
                         
}

/*    
Addition of 10 20 = 30
Fun method invoke of interface Abc
Fun1 method invoke of interface Abc1     */

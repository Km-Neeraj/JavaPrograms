class Parent
{
                         int x=10;
                         void print()
                         {
                            System.out.println("Welcome To Parent class");
                         }
}
class Child extends Parent{
                             int y=20;
                             int res=x+y;
                             void print()
                             {
                                System.out.println("Welcome To Child class");
                                System.out.println("Result ="+res);
                             }


}

public class SingleInheritance {
                         public static void main(String[]abc)
                         {
                            Parent ob=new Parent();
                            ob.print();
                            Child ob1=new Child();
                            ob1.print();
                         }
                         
}

/*   Welcome To Parent class
     Welcome To Child class
     Result =30  */

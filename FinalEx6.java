public class Parent{
                         final void display()
                         {
                                                  System.out.println("Final method in Parent ");
                         }

}
public class Child extends Parent
{
                         void display()  //here error will generate because final method in base class can't override in child 
                         {
                                                  System.out.println("Overrriding final method in child");
                         }
}

public class FinalEx6 {
                         public static void main(String[]abc)
                         {
                                                  Parent p=new Child();
                                                  p.display();

                         }
                         
}

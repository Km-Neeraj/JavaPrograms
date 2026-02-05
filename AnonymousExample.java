class Demo
{
    void show()
    {
                         System.out.println("Base class show");
    }
}
public class AnonymousExample {

                         public static void main(String[]abc)
                         {
                             Demo d=new Demo(){
                                void show()
                                {
                                    System.out.println("show overriden by anonymous class");
                                }
                         
                             };
                             d.show();
                         }
                         
}

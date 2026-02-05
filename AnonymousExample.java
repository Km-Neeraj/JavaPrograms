interface Demo
{
    void show();
   
}
public class AnonymousExample {

                         public static void main(String[]abc)
                         {
                             Demo d=new Demo(){
                                public void show()
                                {
                                    System.out.println("interface show() overriden by anonymous class");
                                }
                         
                             };
                             d.show();
                         }
                         
}

class Base
{
       public final void show()  //final method
       {
                         System.out.println("Base Show  Method");
       }                  
}
class Derived extends Base{
                         public void show()   // final method can't override in child class so here error will generate at compile time
                         {
                              System.out.println("Derived Show Method");
                         }

}


public class FinalEx2 {

                         public static void main(String[] abc)
                         {
                              Base b=new Base();;
                              b.show();
                         }
                         
}

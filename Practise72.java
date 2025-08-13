class A 
{
                         int x=10;
                         int y=20;
}
class B extends A 
{
    int x=14;
    void show()
    {
                         System.out.println(x+" "+y);
    }
}
public class Practise72 {
                         public static void main(String[]abc)
                         {
                         B ob=new B();
                         ob.show();
                         }
                         
}

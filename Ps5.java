
class Parent
{
    int x=5;
}
class Child extends Parent{
     int x=10;
     void printX()
     {
     System.out.println( x+" "+super.x);
     }
}
public class Ps5 {
    public static void main(String[] abc)
    {
         Child c=new Child();
         c.printX();
    }
                         
}

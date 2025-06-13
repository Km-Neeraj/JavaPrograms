class A {
A() 
{ 
                         show();
 }
void show() 
{ 
                         System.out.println("A"); 
}
}
class B extends A {
int x = 5;
void show() 
{ 
                         System.out.println(x); 
}
}
public class Ps6
{
    public static void main(String[]abc)
    {


      B b = new B(); 
    }
                         
}

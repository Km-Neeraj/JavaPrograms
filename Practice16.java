//operator overloading
public class Practice16 {
                         int x=10,y=200;
                         Practice16()
                         {
                           System.out.println("Non_Parametrized constructor ");
                         }
                         Practice16(int a,int b)
                         {
                             x=a;
                             y=b;
                             int res=a+b;
                         }
                         Practice16(int z)
                         {
                             System.out.println("Value of z="+z);
                         }
public static void main(String[]abc)
{
    System.out.println("Constructor Overloading");
    Practice16 ob=new Practice16();
    Practice16 ob1=new Practice16(20,30);
    Practice16 ob2=new Practice16(100);
}

                         
}
/*   
Constructor Overloading
Non_Parametrized constructor 
Value of z=100 */

class Test
{
     void show(int x)
     {
                         System.out.println("int");
     }
     void show(double x)
     {
         System.out.println("Double");
     }
}

public class ps2 {
                         public static void main(String[] abc)
                         {
                             Test ob=new Test();
                             ob.show('A');
                         }
                         
}

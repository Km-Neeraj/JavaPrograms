 class Test
 {
                         int x=12;
                         static double b=13;
                         void show()
                         {
                                                  System.out.println(x+" "+b);
                         }
                         
}

public class Static3
{
                         public static void main(String[]abc)
                         {
                                                  Test a1=new Test();
                                                  Test a2=new Test();
                                                  a1.x=14;
                                                  a1.b=23.5;
                                                  a1.show();
                                                  a2.show();
                         }
}
//14 23.5
//12 23.5

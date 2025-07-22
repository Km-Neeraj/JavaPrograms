

class A
{
  static int x=12;
  static double y=13.2;
  static void print()
  {
                         System.out.println(x++ +" "+y++);
  }

}

                         public class Static5 {
                                                  public static void main(String[]abc)
                                                  {
                                                       A a1=new A();
                                                       a1.print();
                                                       A a2=new A();
                                                       a2.print();                    
                                                  }
                         
}
//12 13.2
//13 14.2

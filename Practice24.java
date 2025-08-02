class A
{
static{
                         System.out.println(1);
                         class B
                         {
                                                  {
                             
                                                  System.out.println(2);
                                                  }
                         }
}
{
                         System.out.println(3);
                         class B
                         {
                            {
                                                  System.out.println(4);
                            }
                         }
}
}
public class Practice24 {
                         public static void main(String[]abc)
                         {
                             new A();
                         }
                         
}
/*
1
3    */

class A 
{
                         int x=10;
                         int y=20;
                         static 
                         {
                                                  System.out.println("Hii");
                         }
}
 class B extends A {
                         int x=14;
                         void show()
                         {
                            System.out.println(x+" "+y);
                         }
                         static
                         {
                             System.out.println("Hello");
                         }
}
                        public class Practise73{
                         public static void main(String[]abc)
                         {
                            B ob=new B();
                            ob.show();
                         }

                         
}

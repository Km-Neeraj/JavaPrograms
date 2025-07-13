class X {
                         int x=111;
                         static class Y extends X 
                         {
                                                  int y=222;
                         }
                         class Z extends X.Y{
                                                  int z=y+333;
                         }

}

public class NestedClassEx5 {
                         public static void main(String[] abc)
                         {
                            X.Z z=new X().new Z();
                            System.out.println(z.x);
                            System.out.println(z.y);
                            System.out.println(z.z);
                            



                         }
                         
}
/*  111
    222
    555 */

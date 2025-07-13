
class X{

                         static int x=3;
                         static class Y
                         {
                                                  static int y=x++;
                                                  static class Z
                                                  {
                                                                           static int z=y++;
                                                  }
                         }

}


public class NestedClassEx1 {
                         public static void main(String[]abc)
                         {
                                                  System.out.println(X.x);
                                                  System.out.println(X.Y.y);
                                                  System.out.println(X.Y.Z.z);

                         }
                         
}

/*  3
    3
    3 */


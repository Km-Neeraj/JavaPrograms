class Parent{
                         int x;
                         static int y;
                         Parent()
                         {
                                                  System.out.println("Hii parent");
                         }
                         Parent(int a)
                         {
                                                  x=a;
                                                  System.out.println("Hello Parent");
                         }
                         static{
                                                  y=15;
                                                  System.out.println("Class Loaded");
                         }
                         {
                                                  System.out.println("Object Created");
                         }
}

public class ParentClassEx6 {
                         public static void main(String[]abc)
                         {
                                                  System.out.println(Parent.y);
                                                  Parent a=new Parent();
                                                  Parent a2=new Parent(4);
                                                  System.out.println(a.x);
                                                  System.out.println(a2.x);

                         }
                         
}
/*      Class Loaded
15
Object Created
Hii parent
Object Created
Hello Parent
0
4 */

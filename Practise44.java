interface Fun
{
   int Fun(int x);
}


public class Practise44 {
                         public static void main(String[]abc)
                         {
                           Fun ob=x->
                           {
                             return x*x;
                           };
                           int r=ob.Fun(20);
                           System.out.println("Value of x Square ="+r);
                         }
                         
}

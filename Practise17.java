class Solution {
                         int x=30;
}


 class B extends Solution   {
                         void fun()
                         {
                         int x=10;
                         int sum=x+this.x;
                         System.out.println(sum);
                         }
                         
}
public class Practise17 
{
              public static void main(String[]abc)
              {
                  B ob=new B();
                  ob.fun();
              }           
}


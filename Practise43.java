class Abc
{
                         int x;
                         int y;

                         {
                             x=10;
                             y=20;
                         }
                         static {
                                   System.out.println("Static block 1 of class Abc");
                         }
                         static 
                         {
                              System.out.println("Static Block 2 of Class Abc");
                         }
                         Abc(int a,int b)
                         {
                             int res=a+b;
                             System.out.println("Parametrized Constructor of Superclass ="+res);
                         }

}
class Bca extends Abc
{
    void print()
    {
                         System.out.println("Value of x Of SuperClass ="+x);
                         System.out.println("Value of y Of SuperClass ="+y);

    }
    static{
                            System.out.println("Static block 1 of Subclass Bca");
    }
    static 
    {
                         System.out.println("Static block 2 of Subclass Bca");
    }
    Bca()
    {
         this(20,30);
        
        System.out.println("Non Parametrized Constructor of Subclass");
    }
    Bca(int a,int b)
    { 
                         super(12,40);
                         System.out.println("Parametrized Constructor of Subclass");
    }
}
public class Practise43 {
  public static void main(String[]abc)
  {
       Bca bc=new Bca();
       bc.print(); 
  }


                         
}

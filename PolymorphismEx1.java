class Ax1{

                   void add(int a,int b)    //compile time polymorphism function overloading
                   {
                       System.out.println("Number Addition = "+(a+b));
                   } 
                   void add(double a,double b)
                   {
                       System.out.println("Floating point addition = "+(a+b));
                   } 
                   
                   String add(String a,String b)
                   {
                         return(a+b);
                   }
}

public class PolymorphismEx1 {
                         public static void main(String[]abc)
                         {
                            Ax1 ob=new Ax1();
                            ob.add(23,20);
                            ob.add(23.4,67.8);
                            String r=ob.add("Hello","Bye");
                            System.out.println("String Addition = "+r);
                         }

}

/*   
Number Addition = 43
Floating point addition = 91.19999999999999
String Addition = HelloBye */

//Lambda Expression
interface Subtraction    //functional interface
{
    void sub();    
}
public class Practise27 {
                         public static void main(String[]abc)
                         {
                            Subtraction ob=()->
                            {
                               int x=100,y=20,res=x-y;
                               System.out.println("Subtraction of "+x+" "+y+" using Lambda expression = "+res);
                            };
                            ob.sub();
                         }
                         
}
//Subtraction of 100 20 using Lambda expression = 80

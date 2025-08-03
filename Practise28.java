//Functional interface using lambda expression
interface FunctionalEx
{
    int square(int x);    
}
public class Practise28 {
                         public static void main(String[]abc)
                         {
                            FunctionalEx ob=x-> x*x;

                                   
                            
                            int square=ob.square(10); 
                            System.out.println("Square  = "+square); 
                         }
                         
}
//Square  = 100

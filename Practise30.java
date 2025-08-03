//Functional Interface
interface FunctionalEx{
    int fun(int x,int y);
}
public class Practise30 {
                         public static void main(String[]abc)
                         {
                            FunctionalEx ob=(x,y)->x*y;
                            System.out.println("Multiplication ="+ob.fun(10,20));
                         }
                         
}
//Multiplication =200

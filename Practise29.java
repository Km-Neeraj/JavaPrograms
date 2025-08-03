//Functional interface 
interface FunctionalEx
{
    int mul(int x);
}
public class Practise29 {
                         public static void main(String[]abc)
                         {
                             FunctionalEx ob=(x)->x*x+100;  //Lambda Expression
                             int input=8;
                             int res=ob.mul(input);
                             System.out.println("Multiplication and Addition of "+input+" = "+res);
                         }
                         
}
//Multiplication and Addition of 8 = 164
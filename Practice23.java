import java.util.*;
class CircleAreaEx
{
    final double pi=3.14;
    double r;
CircleAreaEx()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of a circle to calculate area");
    r=sc.nextDouble();
}
    void calculateArea()
    {
      double area=pi*r*r;
      System.out.println("Area of a circle ="+area);
    }
}
public class Practice23 {
                         public static void main(String[]abc)
                         {
                            CircleAreaEx ob=new CircleAreaEx();
                            ob.calculateArea();
                         }
                         
}
/*  
Enter the radius of a circle to calculate area
5
Area of a circle =78.5 */

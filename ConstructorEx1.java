//Create a class called 'Circle' with a member variable 'radius'. implement a parametrized constructor to 
//initialize radius. include a method 'calculateArea' to calculate and return the area
//of the circle.
class Circle{
                         float radius;
                         float area;
                         Circle(float r)
                         {
                                                  radius=r;
                            float res=calculateArea(r);
                            System.out.println("Area of a circle ="+res);
                         }

                         float calculateArea(float r)
                         {
                             area=3.14f*r*r;    //formula of Circle's Area =pi*r*r 
                                                //where pi=3.14
                             return area;
                         }
}

public class ConstructorEx1 {
                         public static void main(String[] args)
                         {
                                                  Circle c=new Circle(4.5f);

                         }
                         
}

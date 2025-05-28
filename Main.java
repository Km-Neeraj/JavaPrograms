class Parent
{
     static{
              System.out.println("Static block of Parent");
     }
     Parent()
     {
                         System.out.println("Constructor of Parent");
     }
     {
                         System.out.println("Initialization block of Parent");
     }
     void display()
     {
                         System.out.println("Parent Display's");
     }
}

class Child extends Parent{
                         static 
                         {
                                                  System.out.println("Static block of Child");
                         }
                         Child()
                         {
                             System.out.println("Constructor of Child class");
                         }

                         {
                                                  System.out.println("Inisialization block of Child");
                         }
                         void display()
                         {
                                                  System.out.println("Child's Display");
                         }
}


public class Main{
  public static void main(String[] args)
  {
                         Parent obj=new Child();
                         obj.display();
  }
                         
}


//output =
//Static block of Parent
//Static block of Child
//Initialization block of Parent
//Constructor of Parent
//Inisialization block of Child
//Constructor of Child class
//Child's Display
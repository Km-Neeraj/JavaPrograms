class Parent{
                         static{
                                                  System.out.println("Static block of parent");

                               }
                         Parent()     //Non_parametrized constructor
                         {
                              System.out.println("Constructor of Parent");                      
                         }  
                         {   //initialize block
                                                  System.out.println("Initialization block of Parent");
                         }
                         void display()  //method in parent class
                         {
                                                  System.out.println("Parent's display");
                         }
                         
                         
}

class Child extends Parent
{
                         static 
                         {
                                                  System.out.println("Static block of child");
                         }
                         Child() 
                         {
                              System.out.println("Constructor of child");
                         }
                         {
                                                  System.out.println("Initialization block of child");
                         }
                         void display()
                         {
                                                  System.out.println("Child's display");
                         }
}

public class ParentChildEx1 {
                         public static void main(String[] abc)
                         {
                                                  Parent obj=new Child();
                                                  obj.display();
                         }
                         
}

/*Static block of parent
Static block of child
Initialization block of Parent
Constructor of Parent
Initialization block of child
Constructor of child
Child's display */

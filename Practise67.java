
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
         System.out.println("Parent's display");
   }
}
class Child extends Parent
{
     static 
     {
         System.out.println("static block of child");
     }   
     Child()
     {
       System.out.println("Constructor of child");
     }
     {
                         System.out.println("Initialization block of Child");
     }  
     void display()
     {
        System.out.println("Child's display");
     }                 
}
                         public class Practise67 {
                         public static void main(String[]anbc)
                         {
                           Parent obj=new Child();
                           obj.display(); 
                         }
                         
}

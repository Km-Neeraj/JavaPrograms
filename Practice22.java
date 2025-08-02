//create a Superclass 'Employee' with subclasses 'Manager' and 'Developer'. 
//Implement a method 'task()' in each subclass and print each task details

class Employee{
                    void task()
                    {
                       System.out.println("Employee works in IT deparment ");
                    }
}
class Manager extends Employee{
          void task()
          {
             System.out.println("manager works in IT to manage department");
          }
}
class Developer extends Employee
{
     void task()
     {
       System.out.println("Developer task in IT is to develop website or App");
     }
}


public class Practice22 {
                         public static void main(String[]abc)
                         {
                             Employee ob=new Manager();
                             ob.task();
                             Employee ob1=new Developer();
                             ob1.task();
                             Employee ob2=new Employee();
                             ob2.task();
                             
                         }
                         
}
/*  
manager works in IT to manage department
Developer task in IT is to develop website or App
Employee works in IT deparment */

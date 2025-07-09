//create a class called 'Human' with member variables 'name' and 'age'. 
//create a subclass Employee that Inherits from 'Human' and adds a member 
//member variable 'salary'. implements appropriate constructor and methods 
//to initialize and display the details of humans 


class Human{     //base class
                         int age;
                         String name;

                         Human(String name,int age) //parametrized constructor
                         {
                             this.name=name;
                             this.age=age;
                         }

                         void  printDetailsOfHuman()
                         {
                                                  System.out.println("Name of a Human ="+name);
                                                  System.out.println("Age of a Human ="+age);
                                                  
                         }


}
class Employee extends Human{

                         long salary;
                         Employee(String name,int age,long salary)
                         {
                            
                            super(name,age);
                            this.salary=salary;
                         }

                       void  printDetailsOfEmp()
                         {
                                                  System.out.println("Name of an Employee ="+name);
                                                  System.out.println("Age of an Employee ="+age);
                                                  System.out.println("Salary of an Employee ="+salary);
                         }
}
public class InheritanceEx1
{
                         public static void main(String[]abc)
                         {
                             Human ob=new Human("Ram",45);
                             ob.printDetailsOfHuman();
                             Employee ob1=new Employee("Ramayana",87,67L);
                             ob1.printDetailsOfEmp();
                         }
}

/*         Name of a Human =Ram
           Age of a Human =45
           Name of an Employee =Ramayana
           Age of an Employee =87
           Salary of an Employee =67 */
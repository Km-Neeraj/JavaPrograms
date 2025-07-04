//create a class called Employee with member variables name id and salary . Implement
//a parametrized constructor to initialize name & salary variables. Include an initialize
//block to generate a unique id for each employee. create 3 objects of employee
// class and print details via method
class Employee{
                         String name;
                         static int id;
                         int salary;
                         Employee(String n,int s)    //parametrized constructor
                         {
                                                  name=n;
                                                  salary=s;
                         }
                         {
                                                  id++;    //initialize block
                         }
                         void printEmployee()    //method to print employee details
                         {
                               System.out.println("Name = "+name);
                                System.out.println("Id = "+id);
                                 System.out.println("Salary = "+salary);
                         }
}

public class ConstructorEx4 {
                         public static void main(String[]abc)
                         {
                               Employee e1=new Employee("Ram",22000);  //1st object created
                              
                               

                               System.out.println();
                                System.out.println("<!------------ 1st Employee Details -------!>");
                                  e1.printEmployee(); //2nd object created

                                System.out.println();
                                System.out.println("<!------------ 2nd Employee Details -------!>");
                                 Employee e2=new Employee("Renu",32000);   
                                e2.printEmployee();
                                
                                   System.out.println();
                                System.out.println("<!------------ 3rd Employee Details -------!>");
                                  Employee e3=new Employee("Rma",28000);  //3rd object created
                                 e3.printEmployee();


                         }
                         
}

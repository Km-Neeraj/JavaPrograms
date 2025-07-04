//create a class Student with static variables passingMarks initialized to 33 and non static 
//static variables name and marks .implement a parametrized constructor to initialize
//name and marks variables. Create 3 students with name and marks and create a 
//printStudent() method to print the students details with pass or fail


class Student{
         static int passingMarks=33;
         int marks;
         String name;
         Student(String n,int m)
         {
                         name=n;
                         marks=m;

         }
         void printStudent()
         {
                         if(marks<passingMarks)
                         {
                                                  System.out.println("Name = "+name);
                                                  System.out.println("Fail");
                         }
                         else
                         {
                             System.out.println("Name = "+name);
                             System.out.println("Pass");                     
                         }
         }

}
public class ConstructorEx3 {
                         public static void main(String[]abc)
                         {
                                                  Student s1=new Student("Ram",56);
                                                  Student s2=new Student("Shyam",88);
                                                  Student s3=new Student("Abc",25);
                           System.out.println();
                           System.out.println("<!--------- 1st Student Details -------!>");
                           s1.printStudent();

                           System.out.println();
                           System.out.println("<!--------- 2nd Student Details -------!>");
                            s2.printStudent();
                           System.out.println();
                           System.out.println("<!--------- 3rd Student Details -------!>");
                           s3.printStudent();
                         }

                         
}

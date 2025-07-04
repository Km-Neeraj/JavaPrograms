//create a class called student with member variables name and marks implement 
//a parametrized and non parametrized constructor Also include an initializer 
// block to print "Student created". create 2 methods to set values letter also 
// and print student details .create 3 objects of Student class

class Student{
                         String name;
                         int marks;
                       static int count;
                         Student() //non parametrized constructor 
                         {
                                                  this("Ram",56);
                              
                              System.out.println("Student details");
                              
                         }
                         Student(String n,int m)
                         {
                                                  name=n;
                                                  marks=m;
                         }
                         void setValues(String s,int m)    //1st method
                         {
                                                  name=s;
                                                  marks=m;
                         }
                         {  //initialize block
                                                  count++;
                                                  System.out.println(count+"Student created");
                         }
                      void printDetails()
                      {
                         System.out.println("Name = "+name);
                         System.out.println("Marks = "+marks);
                      }

}


public class ConstructorEx5 {

                         public static void main(String[] abc)
                         {
                             Student s1=new Student();
                             
                             s1.setValues("Ram111",99);
                             s1.printDetails();
                              System.out.println();
                             Student s2=new Student();
                             s2.setValues("Seeta",78);
                             s2.printDetails();
                              System.out.println();
                             Student s3=new Student();
                             s3.setValues("Shyam",88);
                             s3.printDetails();

                         }
                         
}

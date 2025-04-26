
//class name in pascal case
public class StudentDetails {
	
	
	public static void main(String[] args) {
		
		Student ob=new Student();
		ob.assignData(11,"Ram",21,"Noida");
		
		Student ob1=new Student();
		ob1.assignData(12,"Hari",22,"Delhi");
		
		Student ob2=new Student();
		ob2.assignData(23,"Prabhu",25,"Vns");
		
		Student ob3=new Student();
		ob3.assignData(24,"God",24,"Gzp");
		
		
		System.out.println("\nStudent 1st details are.....");
		ob.showDetail();
		System.out.println("\nStudent 2nd details are.....");
		ob1.showDetail();
		System.out.println("\nStudent 3rd details are.....");
		ob2.showDetail();
		System.out.println("\nStudent 4th details are.....");
		ob3.showDetail();
}//main close
	
		
}//class  StudentDetails close
	
	class Student
	
	{
		int stdId;   //  variable name in camelcase 
		String stdName;
		int stdAge;
		String Address;
		
		void showDetail()
		{
			
			System.out.println();
			System.out.println("Student_Id = "+stdId);
			System.out.println("Student_Name = "+stdName);
			System.out.println("Student_age = "+stdAge);
			System.out.println("Student_Id = "+Address);
			
		}
		
		void assignData(int id,String name,int age,String adrs)
		
		{
			stdId=id;
			stdName=name;
			stdAge=age;
			Address=adrs;
		}
		
  }
	




public class ClassObjectEx1 {
	
	
	

	public static void main(String[] args) {
		
		
		EmployeeDetails ob=new EmployeeDetails();
		EmployeeDetails ob1=new EmployeeDetails();
		EmployeeDetails ob2=new EmployeeDetails();
		System.out.println();
		System.out.println(" Employee 1st Details.......");
		System.out.println();
		
		
		ob.empData("Ram",56000,"Microsoft","ram@gmail.com");
		ob.showDetail();
		
		System.out.println();
		System.out.println("Employee 2nd Details.........");
		System.out.println();
		ob1.empData("Prabhu",34000,"Adobe","prabhu@gmail.com");
		ob1.showDetail();
		System.out.println();
		System.out.println("Employee 3rd Details.......");
		System.out.println();
		//ob2.showDetail();
		
		ob2.empData("Hari",20000,"TCS","hari@gmail.com");
		ob2.showDetail();
				
		
		

	}
	
}

class EmployeeDetails
{
	String name;
	int salary;
	String cname;
	String email;
	
	
	void showDetail()
	{
		System.out.println();
		System.out.println("Employee_name =" +name);
		System.out.println("Employee_salary ="+salary);
		System.out.println("Company_Name = "+cname);
		System.out.println("Email ="+email);
		
	}
	
	void empData(String n,int s,String cn,String eml)
	{
		name=n;
		salary=s;
		cname=cn;
		email=eml;
		
	}
}

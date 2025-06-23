//Local Variable Type Inference- var
//Introduced in JAVA 10
public class Var2 {

	public static void main(String[] args) {
//		var a[]= {7,8}; //error
//		var a= {7,8}; //error
		
//		can not create array of var 
//		but can store or refer an array.
		
		var a=new int[2];
		System.out.println(a);
	}

}

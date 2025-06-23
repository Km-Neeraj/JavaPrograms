//Local Variable Type Inference- var
//Introduced in JAVA 10

class A{
	int value;
//	var value;    //error, NOT allowed at class level
//	var value=10; //error, NOT allowed at class level
	
	//NOT allowed as argument and return type
//	void m1(var a) { //error
//		
//	}
//	var m2() {  //error
//		
//	}
}
public class Var3 {

	public static void main(String[] args) {
		var a=new A();
		System.out.println(a);
	}

}

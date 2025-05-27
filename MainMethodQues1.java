//Is it possible to have more then one main method in a class?
//Answer: YES (by Overloading)

public class MainMethodQues1 {
	static public void main(String s ){
		System.out.println("Hello");
	}
	static public void main(String []s){
		System.out.println("Hi");
	}
	static public void main(){
		System.out.println("Ok");
	}
}

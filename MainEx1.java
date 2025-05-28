public class MainEx1 {

                         //Is it possible to have more then one main method in a class?
//Answer: YES (by Overloading)

                            void main(String s ){
		System.out.println("Hello");
	}
	static public void main(String []s){
		System.out.println("Hi");
                                                 MainEx1 ob=new MainEx1();
                                                  ob.main("Hello");
                                                  ob.main();
	}
	 void main(){
		System.out.println("Ok");
	}

                         

}
                         


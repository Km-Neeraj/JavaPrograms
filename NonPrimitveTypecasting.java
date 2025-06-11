class P{
	
}
class C extends P{
	
}
public class NonPrimitveTypecasting {
	public static void main(String[] args) {	
		C c1=new C();
		P c2=c1;//Non primitive Upcasting
//		C c3=c2;//error
		C c3=(C)c2;//Non primitive downcasting
		
		
		P p1=new C();//Non primitive upcasting
		
//		C c=(C)new P();//ClassCastException
		
	}
}

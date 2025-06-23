
public class EnumEx {
	enum Month{
		JAN,FEB,mar,april,MAY,JUNE,JULY,AUG,SEPT,OCT,NOV,DEC;
	}
	//final class Month{
	// 	public static final Month JAN=new Month();
	// 	public static final Month FEB=new Month();
	// so on
	//}
	public static void main(String[] args) {
		System.out.println(Month.JAN);
		
		Month a[]=Month.values();
		 for(Month x:a){
		 System.out.println(x);
		 System.out.println(x.ordinal());
		 }
	}

}

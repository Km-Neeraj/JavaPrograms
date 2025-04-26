package printstatement;

public class PrintingEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double a=25.674;
       int b=90;
       
       System.out.print(a+"\n");
       
       System.out.print(b+"\n");
       
       System.out.println(a);
       
       System.out.println(b+"\n");
       
       System.out.format("%d%n",b);  
       
       System.out.print(a+"%n");  //25.674%n
       
       System.out.printf("\n%f", a);    //by default 6 digits 
	}
	
	

}

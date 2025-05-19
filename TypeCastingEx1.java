public class TypeCastingEx1 {
    public static void main(String[] args) {
        
        int a=12;
        System.out.println(a);

        double b=a;//Implicit or Upcasting or Widening
        System.out.println(b);

        int c=(int)b;//Explicit or Downcasting or Narrowing
        System.out.println(c);

    }
}

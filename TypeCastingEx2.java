public class TypeCastingEx2 {
    public static void main(String[] args) {
        char c='i';
        int n=c;//Implicit typecasting
        System.out.println(n);

        int n2=105;
        char c2=(char)n2;//Explicit 
        System.out.println(c2);
    }
}

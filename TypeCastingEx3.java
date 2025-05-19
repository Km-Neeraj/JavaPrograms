public class TypeCastingEx3 {
    public static void main(String[] args) {
        System.out.println(12);//integer literal is by default int
        System.out.println(12.3463);//floating point literal is default double

        // float f=2.5f;//allowed
        float f=(float)2.5;//allowed

        int a=12;
        // byte b=a;//error

        byte b=12;//allowed

        long d=122344555554L;//it is out of range int


    }
}

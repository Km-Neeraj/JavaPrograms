public class String3 {
    public static void main(String[] abc) {
        String obj = "hello";
        String obj1 = new String("hello");
        String obj2 = "hello";

        System.out.println(obj.equals(obj1) + " " + obj.equals(obj2));
        System.out.println((obj == obj1) + " " + (obj == obj2));
    }
}

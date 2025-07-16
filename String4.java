public class String4 {
                         public static void main(String[] abc)
                         {
                            char chars[]={'a','b','c','d','e','f'};
                            String s1=new String(chars);
                            String s2=new String(chars,3,2);
                            System.out.println(s1+" "+s2);
                         }
                         
}
//abcdef de
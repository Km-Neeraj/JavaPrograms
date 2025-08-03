//Functional Interface 
interface InterfaceEx {
                         int fun(int x,int y);

                         
}public class Practise31 {
                         public static void main(String[]abc)
                         {
                           InterfaceEx ob=(x,y)->
                           {
                              return x*y+10-20;
                           };

                           int res=ob.fun(10,20);
                           System.out.println("Output ="+res);
                         }
                         
}
//Output =190
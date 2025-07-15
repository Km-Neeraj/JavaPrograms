
interface A 
{
                         boolean isPrime(int number);

                         
}
public class LambdaExpEx2 {
                         public static void main(String[]abc)
                         {
                            A a=number->{
                                                  if(number<=1)
                                                  {
                                                                           return false;
                                                  }
                                                  for(int i=2;i<=number/2;i++)
                                                  {
                                                                           if(number%i==0){
                                                                                                    return false;
                                                                           }
                                                  }
                                                  return true;
                            };
                            boolean result=a.isPrime(11);
                            System.out.println(result);                      
                         }
                         
}

//true

public class ExceptionEx4 {
                         public static void main(String[]abc)
                         {
                                                  int sum=10;
                                                  try{
                                                                           int i;
                                                                           
                                                                           for(i=-1;i<3;++i)
                                                                           {
                                                                                                    sum=(sum/i);
                                                                           }
                                                  }catch(ArithmeticException e)
                                                                           {
                                                        
                                                                                                    System.out.println("O");
                                                                           }
                                                                           System.out.print(sum);
                                                  }
                         }

//O
//-10
                         


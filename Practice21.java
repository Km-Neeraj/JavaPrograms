//Cfreate an interface called "Animal" with a method 'makeSound()'. Implement classes
//'Dog','Cat','Cow' that implement this interface and override 'makeSound()'' to produce
//the respective sounds

interface  Animal
  {   
                         void makeSound();
                         

                         
}
class Dog implements Animal{
   public  void makeSound()
    {
      System.out.println("Dog barks"); //method ovveriden
    }
}
class Cat implements Animal{
                       public  void makeSound()
                         {
                             System.out.println("Cat voice Meaow");
                         }

}
class Cow implements Animal{
    public void makeSound()
    {
        System.out.println("Cow voice moo");
    }
}
public class Practice21 {
                         public static void main(String[]abc)
                         {
                             Animal ob=new Dog();
                             ob.makeSound();
                             Animal ob1=new Cat();
                             ob1.makeSound();
                             Animal ob2=new Cow();
                             ob2.makeSound();
                         }
}
/*   
Dog barks
Cat voice Meaow
Cow voice moo */

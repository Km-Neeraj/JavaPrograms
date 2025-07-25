class Animal
{
     int a=10;
     void voice()
     {
        System.out.println("animal class a = "+a);
     }

}
class Dog extends Animal{
                         int a=20;
                         void voice()
                         {
                            System.out.println("Dog Barks a ="+a);
                         }
}
class Cat extends Animal{
    int a=100;
    void voice()
    {
       System.out.println("Cat voice a ="+a);
    }
}

public class MultilevelInheritance {
                         public static void main(String[]abc)
                         {
                              Animal a=new Animal();
                              a.voice();
                              Dog d=new Dog();
                              d.voice();
                              Cat c=new Cat();
                              c.voice();
                         }
                         
}

/*     animal class a = 10
       Dog Barks a =20
       Cat voice a =100 */

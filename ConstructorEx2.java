//create a class 'Car' with member variable 'make','model',and 'year'.implement 
// a parametrized constructor to initialize these variables. also ,include a method
// displayDetails() to display the detail of the car


class Car{
            String make;
            String model;
            int year;
            Car(String m,String mdl,int y)
            {
                         make=m;
                         model=mdl;
                         year=y;
              
            } 
            void displayDetails()
            {
                         System.out.println("Name of Car = "+make);
                         System.out.println("Model of Car = "+model);
                         System.out.println("Year of Manufacture = "+year);

            }            
                       
                       
}               
 public class ConstructorEx2 {
        public static void main(String[] abc)
        {
                         Car c=new Car("Toyota","camry",2022);
                         Car c1=new Car("Honda","Civic",2021);
                         Car c2=new Car("Ford","Mustang",2023);
                         System.out.println();
                         System.out.println("<!---------1st Car Details------------->");
                         
                         c.displayDetails();
                         System.out.println();
                         System.out.println("<!---------2nd Car Details------------->");
                         c1.displayDetails();
                         System.out.println();
                         System.out.println("<!---------3rd Car Details------------->");
                         c2.displayDetails();


 }
}
                         


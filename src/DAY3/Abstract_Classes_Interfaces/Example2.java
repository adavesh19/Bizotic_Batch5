package DAY3.Abstract_Classes_Interfaces;

// Interface
// A completely abstract class in java
// Abstract method and data
// Static functions
// No Constructors
// No Instanciation
// No public function in interface

interface Vehicle{
    abstract void start();//Abstract method
    // public int n;
    // Default method
    default void fuel(){
        System.out.println("Fuel ++");
    }
    static void serviceDetails(){
        System.out.println("Upto date");
    }
}
class Car implements Vehicle{
    @Override
        public void start(){
            System.out.println("Cars started");
        }
}

public class Example2 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.fuel();
        Vehicle.serviceDetails();

        
    }
}

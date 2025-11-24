package DAY4.Exception_handling;
// THROW
// Used for throw Exception mannually 
// Or throw Exception in a single line under a
//  block of code
// It uses Constructors of inbuilt exception classes



public class Throw {
    public static void main(String[] args) {
        int age=17;

        if(age<18){
            throw  new ArithmeticException("Not eligible for vote");
        }
        else{
            System.out.println("Eligible to vote");
        }

    }
}

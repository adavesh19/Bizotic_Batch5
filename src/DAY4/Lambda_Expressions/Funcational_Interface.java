package DAY4.Lambda_Expressions;

// 1.Functinal Interfaces
// A interface wih only one abstract method
// TYPES FI:
// Runnable,Comparator,Callable etc.

// 2.Method interface
// Just short form for calling the method
// Keyword ::


class Demo{
    public static void hello(){
        System.out.println("Method interaface");
    }
}

interface Myinterface{
    void call();
}
public class Funcational_Interface {

    public static void main(String[] args) {
        Myinterface m=Demo::hello;
        m.call();
    }
    
}

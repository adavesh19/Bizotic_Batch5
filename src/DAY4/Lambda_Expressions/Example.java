package DAY4.Lambda_Expressions;

// Lambda Expression
// A lamda expression is an anonymous/Nameless
// Function.
// Used to write short code
// Defined by ->





public class Example {
    // WIth lambda expression
    interface Sample {
        void run();
        
    }
    public static void main(String[] args) {
        Sample r2=()->System.out.println("Hello");
        Sample r3=()->System.out.println("Hello for r2");

        
    }
}

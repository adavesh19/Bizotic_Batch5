package DAY4.Exception_handling;

// Unchecked Exception
// 1.Arithmatic Exception
// 2.ArrayIndex out of bound
// 3.Null pointer
public class Unchecked {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
        finally{
            System.out.println("Finally executed");
        }
    }
    
}

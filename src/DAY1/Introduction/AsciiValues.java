package DAY1.Introduction;
import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits");

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        System.out.printf("%d=%s",n1,(char)n1);
        System.out.printf("%d=%s",n2,(char)n2);
        System.out.printf("%d=%s",n3,(char)n3);
        System.out.printf("%d=%s",n4,(char)n4);

sc.close();
        
    }
    
}

package DAY1.Introduction;

import java.util.Scanner;

public class Narnia {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int F=num/10;
        int S=num%10;
        int sum=F+S;
        System.out.println(sum);
        sc.close();
    }
    
}

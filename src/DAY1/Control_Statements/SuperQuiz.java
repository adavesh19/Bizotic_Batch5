package DAY1.Control_Statements;

import java.util.Scanner;

public class SuperQuiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Registration code");
        int N=sc.nextInt();
        if(N<10){
            System.out.println("Invalid");
            sc.close();
            return;
        }
        int L=N%10;
        while(N>=10){
            N=N/10;
        }
        int diff=Math.abs(N-L);
        System.out.println("The Absulute Output: "+diff);
        sc.close();

    }
}

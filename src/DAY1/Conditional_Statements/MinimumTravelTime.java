package DAY1.Conditional_Statements;

import java.util.Scanner;

// H=sqrt(N^2+ N^2)=N*sqrt(2)

public class MinimumTravelTime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num of floors");
        int N=sc.nextInt();
        System.out.println("Enter Williams Velocity");
        int V1=sc.nextInt();
        System.out.println("Enter Elevator Velocity");
        int V2=sc.nextInt();

        double ST=(Math.sqrt(2)*N)/V1;
        double ET=2*N/V2;

        if(ET<ST){
            System.out.println("Elevator");
        }
        else{
            System.out.println("Stairs");
        }



        sc.close();
    }
}

package DAY1.Conditional_Statements;

import java.util.Scanner;

public class StockDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter previous and Current Price\n");
        float Prev = sc.nextFloat();
        float Curr = sc.nextFloat();
        float percentage = ((Curr - Prev) / Prev) * 100;

        if (percentage > 10) {
            System.out.println("BUY");
        } else if (percentage >= -5 && percentage <= 10) {
            System.out.println("HOLD");
        } else if (percentage < -5) {
            System.out.println("SELL");
        }

        sc.close();
    }

}

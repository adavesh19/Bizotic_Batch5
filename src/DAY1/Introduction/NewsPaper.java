package DAY1.Introduction;

import java.util.Scanner;

public class NewsPaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // sou
        System.out.println("Enter wx,");
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();

        int profit=(x-y)*w-100;

        System.out.println("The profit="+profit);

        sc.close();


    }
    
}

package DAY1.Control_Statements;

import java.util.Scanner;

public class Keprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        long n=sc.nextLong();
        long sq=n*n;
        boolean kp=false;
        String s=Long.toString(sq);
        for(int i=0;i<s.length();i++){
            long left=Long.parseLong((s.substring(0, i)));
            long right=Long.parseLong((s.substring(i)));
            
            if(left!=0&&right!=0){
                if(left+right==n){
                    kp=true;
                    break;
                }
            }

        }
        if(kp)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

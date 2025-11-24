package DAY1.Control_Statements;

import java.util.Scanner;

public class EncryptionMessage {

        private int sumNew=0;
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    EncryptionMessage e=new EncryptionMessage();
    // Sample s=new Sample();
    s.var=10;
        e.sumNew=10;
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int digit=num%10;
            if(digit==0||digit==1||digit==4||digit==6||digit==8||digit==9){
                sum=sum+digit;
            }
            num=num/10;
        }

        System.out.println("The sum="+sum);
    }
   
}

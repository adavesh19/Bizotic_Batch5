package DAY2.Polymorphism;

import java.util.Scanner;
class BankInterests{
    public double getInterestsRate(String type,double amount){
        if(type.equalsIgnoreCase("Savings")){
            return amount*0.04;
        }
        else if(type.equalsIgnoreCase("FixedDeposit")){
            return amount*0.06;
        }
        else if(type.equalsIgnoreCase("ReccurringDeposit")){
            return amount*0.05;
        }
        else{
            return 0.0;
        }
    }
    public double getInterestsRate(int code,double amount){
        if(code==1){
            return amount*0.04;
        }
        if(code==2){
            return amount*0.06;
        }
        if(code==3){
            return amount*0.05;
        }
        else{
            return 0.0;
        }
    }

}
public class GetInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String accountType=sc.nextLine();
        double amount=sc.nextDouble();

        BankInterests b=new BankInterests();
        double resultOfInterest=b.getInterestsRate(accountType, amount);

        System.out.println("Interest: "+resultOfInterest);


    }
}

package DAY2.Classes_Objects;

import java.util.Scanner;

class BankAccount{
    private String accountHolderName;
    private double balance;
    
    BankAccount(String accountHolderName,double balance){
            this.accountHolderName=accountHolderName;
            this.balance=balance;

    }

    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance=balance-amount;
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }
    }
    // Getters creation
    public double getBalance(){
        return balance;
    }
     public String getAcHolderName(){
        return accountHolderName;
    }
    


}

public class BankAccoundManagement {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            double InitialBalance=sc.nextDouble();
            sc.nextLine();
            String operation=sc.nextLine();
            double amount=sc.nextDouble();
            BankAccount a=new BankAccount(name, InitialBalance);

            if(operation.equalsIgnoreCase("deposit")){
                a.deposit(amount);
            }
            else if(operation.equalsIgnoreCase("Withdraw")){
                a.withdraw(amount);
            }

            System.out.println("Balance: "+a.getBalance());
            System.out.println("AccountHolder: "+a.getAcHolderName());

        }
}

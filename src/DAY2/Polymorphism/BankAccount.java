package DAY2.Polymorphism;

import java.util.Scanner;

class Account{
    protected int accountID;
    protected String holdername;
    public double balance;
public Account(int accountID,String holdername,double balance){
    if(accountID>=100&&accountID<=999){
        this.accountID=accountID;
    }
    else{
        this.accountID=-1;
    }
    this.holdername=holdername;

    if(balance>=0){
        this.balance=balance;
    }
    else{
        this.balance=0;
    }
}

public void setAccountBalance(double balance){
    if(balance>=0){
        this.balance=balance;
    }
    else{
        this.balance=0;
    }
    System.out.println(this.balance);
}

public double credit(double amount){
    balance=balance+amount;
    return balance;
}

public void printDetails(){
    System.out.println(accountID+" "+holdername+" "+balance);
}
}

class VIPAcoount extends Account{
    public VIPAcoount(int accountID,String holdername,double balance){
        super(accountID, holdername, balance);
    }

    @Override
    public void setAccountBalance(double balance){
        if(balance>=-10000){
            this.balance=balance;
        }
        else{
            this.balance=-10000;
        }
        System.out.println("The balance cant be less then -10k");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter id name balance amount and Nammount");
        int id=sc.nextInt();
        sc.nextLine();
        String name =sc.nextLine();
        double balance=sc.nextDouble();
        double Amount=sc.nextDouble();
        double negativeB=sc.nextDouble();

        Account acc=new Account(id, name, balance);
        acc.printDetails();

        // CREDITING
        double newBal=acc.credit(Amount);
        System.out.println(newBal);

        // base class setAccountBalance
        acc.setAccountBalance(newBal);

        // CREATE VIP CLASS INSTANCE
        VIPAcoount vip=new VIPAcoount(id, name, balance);

        vip.setAccountBalance(negativeB);
        sc.close();





    }
}

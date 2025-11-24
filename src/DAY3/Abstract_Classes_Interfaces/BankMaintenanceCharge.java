package DAY3.Abstract_Classes_Interfaces;

import java.time.LocalDate;
import java.util.Scanner;
interface MaintenanceCharge {
        double computeMaintennanceCharge(int years);
}
class Account{
    String name;
    long number;
    double balance;
    LocalDate startDate;

    Account(String name ,long number,double balance,LocalDate starDate){
        this.name=name;
        this.number=number;
        this.balance=balance;
        this.startDate=starDate;
    }
}
class Savings extends Account implements MaintenanceCharge{
    Savings(String name,long number,double balanc,LocalDate starDate){
        super(name, number, balanc, starDate);
    }
    @Override
    public double computeMaintennanceCharge(int years){
        int m=50;
        return (2*m*years);
    }
}
class Current extends Account implements MaintenanceCharge{
    Current(String name,long number,double balanc,LocalDate starDate){
        super(name, number, balanc, starDate);
    }
    @Override
    public double computeMaintennanceCharge(int years){
        int m=100;
        return (m*years)+200;
    }
}
public class BankMaintenanceCharge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Current Account\n2.Savings Account");
        int choice =sc.nextInt();
        sc.nextLine();
        System.out.println("NAME");
        String name=sc.nextLine();
        System.out.println("Account Number");
        long number=sc.nextLong();
        System.out.println("Account Balance");
        double balance=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the start date:");
        LocalDate startDate =LocalDate.parse(sc.nextLine());

        System.out.println("Enter the number of years");
        int years=sc.nextInt();

        if(choice==1){
            Current c=new Current(name, number, balance, startDate);
            double charge=c.computeMaintennanceCharge(years);
            System.out.println("THE MAINTAINENCE CHARGE: "+charge);
        }
        else if (choice==2) {
            Savings s=new Savings(name, number, balance, startDate);
            double charge=s.computeMaintennanceCharge(years);
           System.out.println("THE MAINTAINENCE CHARGE: "+charge);
        }
        else{
            System.out.println("Invalid choice");
        }

        }

    }
    

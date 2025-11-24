package DAY3.Abstract_Classes_Interfaces;

import java.util.Scanner;

class CurrentBill{
    public double amount(){
        return 0.0;
    }
}
class Fan extends CurrentBill{
    public double watts;
    public double hours;
    Fan(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }
    @Override
    public double amount(){
        double units=(watts*hours)/1000;
        return units*1.5;
    }
}
class Light extends CurrentBill{
    public double watts;
    public double hours;
    Light(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }
    @Override
    public double amount(){
        double units=(watts*hours)/1000;
        return units*1.5;
    }
}
class TV extends CurrentBill{
    public double watts;
    public double hours;
    TV(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }
    @Override
    public double amount(){
        double units=(watts*hours)/1000;
        return units*1.5;
    }
}
public class CurrentBillCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the watts and hours for FAN");
        double fwatts=sc.nextDouble();
        double fhours=sc.nextDouble();

        System.out.println("Enter the watts and hours for Light");
        double lwatts=sc.nextDouble();
        double lhours=sc.nextDouble();

        System.out.println("Enter the watts and hours for TV");
        double tvwatts=sc.nextDouble();
        double tvhours=sc.nextDouble();
        // Creating insatance of class 
        Fan f=new Fan(fwatts, fhours);
        Light l=new Light(lwatts,lhours);
        TV t=new TV(tvwatts, tvhours);

        double total=f.amount()+l.amount()+t.amount();
        System.out.println(total);
        sc.close();

    }
}

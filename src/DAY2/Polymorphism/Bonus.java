package DAY2.Polymorphism;

import java.util.Scanner;

class Employee{
    double salary;
    Employee(double salary){
        this.salary=salary;
    }
    double calculateBonus(){
        return salary*1.10;
    }
}
class Manager extends Employee{
    Manager(double salary){
        super(salary);
    }
    @Override
    double calculateBonus(){
        return salary*1.15;
    }
}
public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String role=sc.nextLine().trim();
        double salary=sc.nextDouble();

        Employee emp;

        if(role.equalsIgnoreCase("MANAGER")){
            emp=new Manager(salary);
        }
        else{
            emp=new Employee(salary);
        }

        double Bonus =emp.calculateBonus();
        System.out.println("The salary after bonus: "+Bonus);
    }
}

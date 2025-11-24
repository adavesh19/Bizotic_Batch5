package DAY2.Inheritence;

import java.util.Scanner;

class EmployeeDetails{
    public int empid;
    float salary;
    EmployeeDetails(int empid,float salary){
        this.empid=empid;
        this.salary=salary;
    }
}
class Emplevel extends EmployeeDetails{
    Emplevel(int empid,float salary){
        super(empid, salary);
    }
    public int getLevel(){
        if(salary>1000){
            return 1;
        }
        else{
            return 2;
        }
    }
    public void display(){
        System.out.println(empid);
        System.out.println(salary);
        System.out.println(getLevel());
    }
}
public class EmployeeLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empid=sc.nextInt();
        float salary=sc.nextFloat();
        Emplevel emp=new Emplevel(empid, salary);

        emp.display();
        sc.close();
    }
    
}

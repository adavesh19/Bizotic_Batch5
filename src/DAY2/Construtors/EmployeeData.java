package DAY2.Construtors;

import java.util.Scanner;

class Professor{
    public int id ;
    public String name;
    public int salary;
// Default
    Professor(){

    }
    Professor(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of professors");
        int N=sc.nextInt();
        Professor[] p=new Professor[N];

        for(int i=0;i<N;i++){
            int id=sc.nextInt();
            String name=sc.next();
            int salary=sc.nextInt();
            p[i]=new Professor(id,name,salary);
        }

        for(int i=0;i<N;i++){
            if(p[i].salary>=20000){
                p[i].display();
            }
        }

        
    }
    
}

package DAY2.Polymorphism;

import java.util.*;

class GetColories{
    private double totalColories;

    // 1.Bread only 
    public void calculateColories(int BreadSlices){
        totalColories=BreadSlices*74;
    }
    // 2.Bread+jam
    public void calculateColories(int BreadSlices,int spoons){
        totalColories=(BreadSlices*74)+(spoons*26);
    }

    // 3.Bread+butter+jam
    public void calculateColories(int Bs,int jspoons,int bspoons){
        totalColories=(Bs*74)+(jspoons*26)+(bspoons*102);
    }
    public double GetColoriesmethod(){
        return totalColories;
    }

    public double calculateEnergy(){
        return totalColories*4.1868;
    }
}
public class Colories{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        GetColories g=new GetColories();

        System.out.println("1.Bread Only");
        System.out.println("2.Bread+Jam");
        System.out.println("3.Bread+jam+butter");
        System.out.println("Enter the choice");
        int choice=sc.nextInt();
int bread,jam,buter;
        switch (choice) {
            case 1:
                System.out.println("Enter the numeber of slice");
                 bread=sc.nextInt();
                g.calculateColories(bread);
                break;
            case 2: 
                System.out.println("Enter number of slice");
                bread=sc.nextInt();
                System.out.println("Enter the number of spoons");
                jam=sc.nextInt();
                g.calculateColories(bread,jam);
            case 3: 
                System.out.println("Enter number of slice");
                bread=sc.nextInt();
                System.out.println("Enter the number of spoons");
                jam=sc.nextInt();
                System.out.println("Enter butter spoons");
                buter=sc.nextInt();
                g.calculateColories(bread, jam, buter);
            default:
                break;
        }

double Colories=g.GetColoriesmethod();
double Energy=g.calculateEnergy();

System.out.println("ENERGY:"+Energy+"\nCALORIES: "+Colories);

    }
}
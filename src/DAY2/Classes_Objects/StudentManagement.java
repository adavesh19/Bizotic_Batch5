package DAY2.Classes_Objects;

import java.util.Scanner;

class Student{
    int rollno;
    int mark1,mark2,mark3;
    Student(int rollno,int mark1,int mark2,int mark3){
        this.rollno=rollno;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;

    }
    int total(){
        return mark1+mark2+mark3;
    }

}


public class StudentManagement {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students\n");
        int n=sc.nextInt();
        // int[] arr=new int[5];
        Student[] arr=new Student[5];

        for(int i=0;i<n;i++){
            int roll=sc.nextInt();
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            arr[i]=new Student(roll, m1, m2, m3);
        }
// TOTAL MARKS
        for(int i=0;i<n;i++){
            System.out.println(arr[i].total());
        }
    
// Highest marks of Each subject
int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
int roll1=-1,roll2=-1,roll3=-2;
System.out.println(max1);
int maxTotal=-1,rolltotal=-1;
for(int i=0;i<n;i++){
    Student s=arr[i];
    if(s.mark1>max1){
        max1=s.mark1;
        roll1=s.rollno;
    }
    if(s.mark2>max2){
        max2=s.mark2;
        roll2=s.rollno;
    }
    if(s.mark3>max3){
        max3=s.mark3;
        roll3=s.rollno;
    }
    if(s.total()>maxTotal){
        maxTotal=s.total();
        rolltotal=s.rollno;
    }

}



    }
    
}

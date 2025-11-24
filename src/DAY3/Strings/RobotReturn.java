package DAY3.Strings;

import java.util.Scanner;

public class RobotReturn {
    public static boolean Moves(String moves){
        int x=0,y=0;

        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='R'){
                x++;
            }
            else if(ch=='L'){
                x--;
            }
        }
        return x==0&&y==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operations: ");
        String moves=sc.next();

        boolean result =Moves(moves);
        System.out.println(result);
        
    }
    
}

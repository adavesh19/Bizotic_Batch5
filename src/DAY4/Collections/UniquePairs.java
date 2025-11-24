package DAY4.Collections;

import java.util.*;
import java.util.Scanner;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pairs");
        int n=sc.nextInt();
        sc.nextLine();
        Set<String> pairs= new HashSet<>();

        for(int i=0;i<n;i++){
            String pair=sc.nextLine();
            pairs.add(pair);
            System.out.println(pairs.size());
        }

    }
    
}

package DAY4.Collections;

import java.util.*;
import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        input = input.toLowerCase();

        input = input.replaceAll("[^a-z]", " ");
        String[] words = input.trim().split("\\s+");
        
        Map<String, Integer> map = new HashMap<>();
        for (String i : words) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println("Word occured");

        for (String i : map.keySet()) {
            System.out.println(i + ":" + map.get(i));
        }

    }

}

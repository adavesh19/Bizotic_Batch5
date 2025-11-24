package DAY1.Introduction;

import java.util.Scanner;

class CrikectGround {
    public static void main(String[] Bavii) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        // LOGIC
        int RopeLength = 2 * (l + b);
        int carpetArea = l * b;
        System.out.println("RopeLength=" + RopeLength);
        System.out.println("CarpetArea=" + carpetArea);
        sc.close();

    }
}

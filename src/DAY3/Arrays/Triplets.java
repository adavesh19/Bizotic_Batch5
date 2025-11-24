package DAY3.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Triplets {
    public static void FindingTriplet(int[] prices, int budget) {
        Arrays.sort(prices);

        for (int i = 0; i < prices.length - 2; i++) {
            int left = i + 1;
            int right = prices.length - 1;
            while (left < right) {
                int sum = prices[i] + prices[left] + prices[right];

                if (sum == budget) {
                    System.out.println("Triplet Found: " + prices[i] + " " + prices[left] + " " + prices[right]);
                    return;
                } else if (sum < budget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No valid triplets found");

    }

    public static void main(String[] args) {
        int prices[] = { 1, 2, 3, 4, 5 };
        int budget = 12;

    }

}

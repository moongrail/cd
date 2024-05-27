package kyu6;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n];
        Arrays.fill(tills, 0);

        for (int customer : customers) {
            int index = findMinIndex(tills);
            tills[index] += customer;
        }

        return findMax(tills);
    }

    private static int findMinIndex(int[] tills) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < tills.length; i++) {
            if (tills[i] < min) {
                min = tills[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static int findMax(int[] tills) {
        return Arrays.stream(tills).max().getAsInt();
    }
}

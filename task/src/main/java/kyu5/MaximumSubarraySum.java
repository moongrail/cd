package kyu5;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i : arr) {
            if (currentSum <= 0) {
                currentSum = i;
            } else {
                currentSum += i;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        if (maxSum < 0) {
            maxSum = 0;
        }

        return maxSum;
    }
}

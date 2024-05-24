package kyu6;

public class TribonacciSequence {
    public double[] tribonacci(double[] s, int n) {
        double[] result = getBaseArray(s, n);

        for (int i = s.length; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result; // hackonacci me
    }

    //Can be Arrays.copyOf(s,n)
    private double[] getBaseArray(double[] s, int n) {
        double[] result = new double[n];

        for (int i = 0; i < s.length && i < n; i++) {
            result[i] = s[i];
        }

        return result;
    }
}

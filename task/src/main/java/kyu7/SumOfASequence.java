package kyu7;

public class SumOfASequence {
    public static int sequenceSum(int start, int end, int step) {
        // write your code here
        return start > end ? 0 : start + sequenceSum(start + step, end, step);
    }
}

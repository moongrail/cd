package kyu7;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            return number / 5 * 5;
        } else {
            return (number + 4) / 5 * 5;
        }
    }
}

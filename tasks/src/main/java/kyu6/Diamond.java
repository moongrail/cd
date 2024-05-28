package kyu6;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) return null;
        StringBuilder result = new StringBuilder();
        int idx = 1;

        createDiamond(n, result, idx);

        return result.toString();
    }

    private static void createDiamond(int n, StringBuilder result, int idx) {
        while (idx < n) {
            int spaces = (n - idx) / 2;
            getEights(result, idx, spaces);
            idx++;
        }

        while (idx > 0) {
            int spaces = (n - idx) / 2;
            getEights(result, idx, spaces);
            idx--;
        }
    }

    private static void getEights(StringBuilder result, int idx, int n) {
        if (idx % 2 != 0) {
            result
                    .append(" ".repeat(n))
                    .append(("*".repeat(Math.max(0, idx))))
                    .append("\n");
        }
    }
}

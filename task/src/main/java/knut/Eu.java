package knut;

public class Eu {
    public static int nod(int m, int n) {
        if (m < n){
            int temp = m;
            m = n;
            n = temp;
        }

        int r = m % n;

        if (r == 0) {
            return n;
        }

        return nod(n, r);
    }
}

public class Recursive {
    public static void main (String[] args) {
        System.out.println(fibNaive(4));
        System.out.println(fibNaive(8));
        System.out.println(fibNaive(10));
    }
    private static long fibNaive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
}

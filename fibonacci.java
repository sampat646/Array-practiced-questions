public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.println(FibonacciNumber(i));
        }

    }

    public static int FibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (FibonacciNumber(n - 1) + FibonacciNumber(n - 2));
        }
    }
}

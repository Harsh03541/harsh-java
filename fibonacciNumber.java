public class fibonacciNumber {
    public static void main(String[] args) {
        int n = 10;

        fib(n);
    }

    public static void fib(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < n; i++) {

            System.out.print(n1 + "  ");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
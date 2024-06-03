import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of series: ");
        int n = sc.nextInt();
        

        fib(n);
    }

    public static void fib(int n) {
        int count=0;
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < n; i++) {

            System.out.print(n1 + "  ");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count++;
        }
        System.out.println("count: "+ count);
    }
}
import java.util.Scanner;
public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n =  sc.nextInt();
        int res = isStrong(n);
        if(res == n) {
            System.err.println(n + " is a strong number");
        }
        else{
            System.err.println(n + " is not a strong number");
        }
    }
    public static int isStrong(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n%10;
            sum = sum + factorial(digit);
            n = n / 10;
        }  
        return sum; 
    }
    public static int factorial(int n) {
        int fact = 1;
        for(int i =1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

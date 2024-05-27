import java.util.Scanner;

public class PerfectNumberRange {
    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {

            if(n % i ==0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        
        for(int v = 1; v <= range; v++) {
            
            boolean res = isPerfectNumber(v);
            if(res) {
                System.out.println(v + " IS A PERFECT NUMBER");
            }
        }
    }
}

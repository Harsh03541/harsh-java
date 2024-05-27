import java.util.Scanner;

public class posNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the any integer: ");
        int num = scanner.nextInt();
        if(num < 0) {
            System.err.println("Entered number is negative");
        }
        else if(num > 0) {
            System.err.println("Entered number is postive");
        }
        else {
            System.err.println("Entered number is zero");
        }
    }
}

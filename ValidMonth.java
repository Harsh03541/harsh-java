import java.util.Scanner;

public class ValidMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        
        if (isValidMonth(month)) {
            System.out.println("Valid month number.");
        } else {
            System.out.println("Invalid month number.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }
}


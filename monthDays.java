import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        
        int days = getDaysInMonth(month);
        
        if (days == -1) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println("Number of days in the month: " + days);
        }
    }
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return 28; // Assuming non-leap year, can add leap year check for 29 days
            default:
                return -1; // Invalid month number
        }
    }
}


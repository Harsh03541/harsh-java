import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (isTwoDigitNumber(number)) {
            System.out.println("The entered number is a two-digit number.");
        } else {
            System.out.println("The entered number is not a two-digit number.");
        }
    }
    
    public static boolean isTwoDigitNumber(int number) {
        return number >= 10 && number <= 99;
    }
}

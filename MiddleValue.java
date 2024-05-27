import java.util.Scanner;

public class MiddleValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        int middle = findMiddle(num1, num2, num3);
        System.out.println("The middle value is: " + middle);
        
        scanner.close();
    }
    
    public static int findMiddle(int num1, int num2, int num3) {
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            return num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            return num2;
        } else {
            return num3;
        }
    }
}


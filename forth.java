import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int n3 = scanner.nextInt();

         if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number: ");
        int num = sc.nextInt();
        int result = binary_decimal(num);
        System.out.println("Decimal number "  + num + " is : " + result );
    }
    public static int binary_decimal(int bin) {
        int dec = 0, pow = 1;
        while (bin != 0) {
            int r = bin % 10;
            dec = dec + r * pow;
            pow = pow * 2;
            bin /= 10;
        }
        return dec;
    }
}

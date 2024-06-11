import java.util.Scanner;

public class Octal_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any octal number: ");
        int num = sc.nextInt();
        int result = binary_octal(num);
        System.out.println("Decimal number "  + num + " is : " + result );
    }
    public static int binary_octal(int oct) {
        int dec = 0, pow = 1;
        while (oct != 0) {
            int r = oct % 10;
            dec = dec + r * pow;
            pow = pow * 8;
            oct /= 10;
        }
        return dec;
    }
}

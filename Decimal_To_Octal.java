import java.util.Scanner;

public class Decimal_To_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        String result = DecimalBinary(number);
        System.out.println("Octal of " + number + " : " + result);
    }
    public static String DecimalBinary(int dec) {
        String oct = " ";
        do{
            int r = dec % 8;
            oct = r + oct;
            dec /= 8;
        } while(dec != 0);

        return oct;
    }
}

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        String result = DecimalBinary(number);
        System.out.println("Binary of " + number + " : " + result);
    }
    public static String DecimalBinary(int dec) {
        String bin = "";
        do{
            int r = dec % 2;
            bin = r + bin;
            dec /= 2;
        } while(dec != 0);

        return bin;
    }
}

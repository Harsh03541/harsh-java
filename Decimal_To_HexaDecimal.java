import java.util.Scanner;

public class Decimal_To_HexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();
        String result = DecimalBinary(number);
        System.out.println("HexaDecimal of " + number + " : " + result);
    }
    public static String DecimalBinary(int dec) {
        String hexa = " ";
        do{
            int r = dec % 16;

            if(r < 10)
                hexa = r + hexa;
            else
                hexa = (char)(55+r) + hexa;

            dec /= 16;
        } while(dec != 0);

        return hexa;
    }
}

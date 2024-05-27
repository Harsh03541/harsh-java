import java.util.Scanner;

public class date {
    public static int showDate(int dd, int mm, int yy) {
        if (dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < 1) {
            System.out.println("Entered " + dd + "-" + mm + "-" + yy + " is invalid");
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11 && dd > 30) {
            System.out.println("Entered " + dd + "-" + mm + "-" + yy + " is invalid");
        } else if (mm == 2 && dd == 29) {
            System.out.println("Entered " + dd + "-" + mm + "-" + yy + " is invalid");
        } else {
            System.out.println("Entered " + dd + "-" + mm + "-" + yy + " is valid");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date: ");
        int dd = sc.nextInt();
        System.out.println("enter the month: ");
        int mm = sc.nextInt();
        System.out.println("enter the year: ");
        int yy = sc.nextInt();

        showDate(dd, mm, yy);
    }
}
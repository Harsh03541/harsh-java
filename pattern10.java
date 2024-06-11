
// A
// BB
// CCC
// DDDD
// EEEEE

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int lines = sc.nextInt();
        startPattern(lines);
    }
    public static void startPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print((char)(64+i));
            }
            System.err.println();
        }
    }
}

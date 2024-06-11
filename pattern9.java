
// A
// AB
// ABC
// ABCD
// ABCDE

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int lines = sc.nextInt();
        startPattern(lines);
    }
    public static void startPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print((char)(64+j));
            }
            System.err.println();
        }
    }
}

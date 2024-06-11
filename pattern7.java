
// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int lines = sc.nextInt();
        startPattern(lines);
    }
    public static void startPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}

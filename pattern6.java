
// 12345
// 2345
// 345
// 45
// 5

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines : ");
        int lines = sc.nextInt();
        startPattern(lines);
    }
    public static void startPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j=i; j <= n; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}

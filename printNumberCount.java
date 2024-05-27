import java.util.Scanner;

public class printNumberCount {
    public static boolean isPrime(int num) {
        if(num <= 1) 
            return false;

        for(int i = 2 ; i < num; i++) {
            if(num % i == 0) 
                return false;
    }
    return true;
}
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        System.out.print("Prime number in between (1 to " + range +") : \n");
        for(int i = 1; i <= range; i++)
        if(isPrime(i)) {
            count++;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}

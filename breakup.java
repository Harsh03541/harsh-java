import java.util.Scanner;

public class breakup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int a = sc.nextInt();

        if(a % 3==0 && a % 5==0) {
            System.out.println("Sanju and Geeta");
        }
        else if (a % 5==0 ) {
            System.out.println("Geeta");
        }
        else if (a % 3==0 ) {
            System.out.println("Sanju");
        }
        else{
            System.out.println("Breakup");   
        }
    }
}

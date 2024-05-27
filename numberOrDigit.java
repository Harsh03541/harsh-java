import java.util.*;
public class numberOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number or digits: ");
        int num = sc.nextInt();
        if(num > 0 && num <= 9) {
            System.out.println("this is digit");
        }
        else{
            System.out.println("this is number");
        }
    }
}

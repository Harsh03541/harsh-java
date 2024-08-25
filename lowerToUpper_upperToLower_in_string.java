import java.util.Scanner;

public class lowerToUpper_upperToLower_in_string {
    public static void main(String[] args) {

        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("Given String: " + str);

        for(int i = 0; i < str.length(); i++) {

            boolean res = true;
            char ch = str.charAt(i);
            
            if(ch == ' ' || ch >= 9)
                continue;

            int asci = (int) ch;

            if(asci >= 97) 
                res = false;

            if(res == true) {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }
            else {
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println("Result: " + str);
    }
}

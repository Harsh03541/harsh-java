public class PalindromicSubstring {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
s
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("abcba");

        System.out.println("Given String: " + str);

        int count = 0;

        System.out.print("Palindromic Sub String: ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\ncount: " + count);
    }
}

public class reverseOfNumber {
        public static void main(String[] args) {
            int num = 258456;
            int res = product(num);
            System.out.println("Product of digits: "+ res);
        }
        static int product(int a) {
            int sum = 0, ans = 0;
            while (a>0) {
                int digit = a%10;
                ans = ans  * 10 + digit;
                a/=10;
            }
            return ans;
        }
}

